
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
