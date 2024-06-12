import pandas as pd

#Create dataset
data = {
    "Usernames": ["admin", "Charles", "Deku"],
    "Passwords": ["password", "Charl13", "AllMight"]
}

#convert data to DataFrame
df = pd.DataFrame(data)

# Print the DataFrame
print("~~~~~~~~~~~~~~~~~~~~DataFrame~~~~~~~~~~~~~~~~~~~~")
print(df)

#Write DataFrame to CSV file
df.to_csv("../Inputs/credential.csv", index=False)

#Read from CSV
cred = pd.read_csv("../Inputs/credential.csv")
print("~~~~~~~~~~~~~~~~~~~~CSV~~~~~~~~~~~~~~~~~~~~")
print(cred)

#Print the values only in the Usernames column
print("~~~~~~~~~~~~~~~~~~~~Usernames column~~~~~~~~~~~~~~~~~~~~")
print(df["Usernames"])

#Print the username and password of the second row
print("~~~~~~~~~~~~~~~~~~~~Second Row~~~~~~~~~~~~~~~~~~~~")
print(df["Usernames"])

#Sort the Usernames column data in ascending order and print data
print("~~~~~~~~~~~~~~~~~~~~Usernames column ascending~~~~~~~~~~~~~~~~~~~~")

#Sort the Passwords column in descending order and print data
print("~~~~~~~~~~~~~~~~~~~~Password column descending~~~~~~~~~~~~~~~~~~~~")