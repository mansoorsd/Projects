import requests
from datetime import datetime
import smtplib
import time


MY_LAT = 15.808341026306152  # Your latitude
MY_LONG = 80.16494750976562  # Your longitude
my_email = "testudemy0511@gmail.com"
password = "Mansoor@6677"


# Getting Position of ISS

def is_iss_overhead():
    response = requests.get(url="http://api.open-notify.org/iss-now.json")
    response.raise_for_status()
    data = response.json()

    iss_latitude = float(data["iss_position"]["latitude"])
    iss_longitude = float(data["iss_position"]["longitude"])

    if (MY_LAT - 5 <= iss_latitude <= MY_LAT + 5) and (MY_LONG - 5 <= iss_longitude <= MY_LONG + 5):
        return True


# Your position is within +5 or -5 degrees of the ISS position.

# Getting My location details
def is_night():
    parameters = {
        "lat": MY_LAT,
        "lng": MY_LONG,
        "formatted": 0,
    }

    response = requests.get("https://api.sunrise-sunset.org/json", params=parameters)
    response.raise_for_status()
    data = response.json()
    sunrise = int(data["results"]["sunrise"].split("T")[1].split(":")[0])
    sunset = int(data["results"]["sunset"].split("T")[1].split(":")[0])
    time_now = datetime.now().hour

    if time_now >= sunset or time_now <= sunrise:
        return True


while True:
    time.sleep(60)
    if is_night() and is_iss_overhead():
        connection = smtplib.SMTP("smtp.gmail.com", 587)
        connection.starttls()
        connection.login(user=my_email, password=password)
        connection.sendmail(
            from_addr=my_email,
            to_addrs="mansoorboss006@gmail.com",
            msg=f"LOOKUP 👆  \n\n The ISS is above you in the sky"
        )


