
# TODO: Create a letter using starting_letter.txt


lettr = open(".\Input\Letters\starting_letter.txt", mode="r" )

abc = lettr.readlines()
print(abc)
letter = ""
for word in abc:
    letter += word

print(letter)
lettr.close()


names = open(r".\Input\Names\invited_names.txt", mode="r")

name_list = names.readlines()
names_of_users =""

for name in name_list:
    names_of_users+= name

names_of_users = names_of_users.replace("\n"," ")
name_list = names_of_users.split(" ")

names.close()
print(name_list)


for name in name_list:
    letter = letter.replace("[name]", name)
    lettr1 = open(f".\Output\ReadyToSend\letter_to_{name}.txt",mode="w")
    lettr1.write(letter)
    lettr1.close()





# for word in lettr.readlines():


# for each name in invited_names.txt
# Replace the [name] placeholder with the actual name.
# Save the letters in the folder "ReadyToSend".

# Hint1: This method will help you: https://www.w3schools.com/python/ref_file_readlines.asp
# Hint2: This method will also help you: https://www.w3schools.com/python/ref_string_replace.asp
# Hint3: THis method will help you: https://www.w3schools.com/python/ref_string_strip.asp