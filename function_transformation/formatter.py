def formatter(pattern):
    def inner_func(text):
        result = ""
        i = 0
        while i < len(pattern):
            # replacing {} in the pattern with the text
            if pattern[i:i+2] == '{}':
                result += text
                i += 2
            else:
                # adding the * of the pattern in the text
                result += pattern[i]
                i += 1
        return result
    return inner_func

# It's easy to create new formatters now!
bold_formatter = formatter("**{}**") # here the function formatter is not called but just passed to bold_formatter variable
italic_formatter = formatter("*{}*")
bullet_point_formatter = formatter("* {}")

print(bold_formatter("Hello")) # hello is passed to text variable here 
# **Hello**
print(italic_formatter("Hello"))
# *Hello*
print(bullet_point_formatter("Hello"))
# * Hello
