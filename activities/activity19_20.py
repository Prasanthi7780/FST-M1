import pandas
from pandas import ExcelWriter

# Activity 19
# Create the dataset
data = {
'FirstName' : ["Satvik", "Avinash", "Lahri"],
'LastName' : ["Shah", "Kati", "Rath"],
'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
'PhoneNumber' : ["4537829158", "4892184058", "4528727830"]
}
# Convert the data into a DataFrame
df = pandas.DataFrame (data)
# Write the dataframe to an Excel file
writer = ExcelWriter("./sample.xlsx")
df.to_excel(excel_writer=writer, sheet_name="Sheet1", index=False)
# To commit the data to the file
writer.close()

# Activity 20
input_file = pandas.read_excel("./sample.xlsx", 0, engine="openpyx1")

# Print the number of rows and columns
print("Rows:", input_file.shape[0], "Columns:", input_file.shape [1])
# Print the data in the emails column only
print(input_file["Email"])
# Sort the data based on FirstName in ascending order and print the data
print(input_file. sort_values ("FirstName"))

