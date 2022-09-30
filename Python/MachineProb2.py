def main():
    word = input("Enter the phrase: ")
    frstlttrofword = word.split()
    acronym = ""
    for i in frstlttrofword:
        acronym = acronym + i[0].upper()
    print("The acronym  is :",acronym + " .")

main()
