# rogl
Random Object Generation Library written in Java to help you create random test objects to use in Unit Tests

# Problem
Personally I was always to lazy to create test objects for Unit Testing. However, test objects are necessary

# Solution
Instead of manually creating test objects, why not creating them automatically?

# How to use
See example in ***examples*** directory. For an object to be generated, it **must** have an empty constructor **and** setters
**for each** attribute

Currently only objects with primitive or String attributes are supported.

# Plans
+ Add support for all types of attributes


# Disclaimer
Currently, it's a work in progress. Many things are going to change and many things are going to break. I am not
responsible if your cat gets eaten. I know there are other libraries that can do this and even more. It is nothing more than a pet project
