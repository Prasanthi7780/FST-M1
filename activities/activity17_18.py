import pandas

# Activity 17
# Create the dataset
data = {
"usernames": ["admin", "Charles", "Deku"],
"passwords": ["password", "Charl13", "AllMight"]
}
# Convert the data into a DataFrame
df =pandas.DataFrame(data)
# Write the dataframe to a file
df.to_csv("./sample.csv")

# Activity 18
input_file = pandas. read_csv("./sample.csv")

# Print the values only in the Usernames column
print(input_file["usernames"])
# Print the username and password of the second row
print("Second row values: ", input_file["usernames"] [1], input_file["passwords" ] [1] )
# Sort the Usernames column data in ascending order and print data
print(input_file.sort_values("usernames"))
# Sort the Passwords column in descending order and print data
print(input_file.sort_values("usernames", ascending=False))
