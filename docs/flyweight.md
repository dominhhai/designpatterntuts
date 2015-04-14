Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and increase performance. This type of design pattern comes under structural pattern as this pattern provides ways to decrease object count thus improving the object structure of application.

Flyweight pattern tries to reuse already existing similar kind objects by storing them and creates new object when no matching object is found. 


One difference in that flyweights are commonly immutable instances, while resources acquired from the pool usually are mutable.

So you create flyweights to avoid the cost of repeatedly create multiple instances of objects containing the same state (because they are all the same, you just create only one and reuse it throughout all places in your app), while resources in a pool are particular resources that you want to control individually and possibly have different state, but you don't want to pay the cost of creation and destruction because they are all initialized in the same state. So, Flyweight is usually used to minimize memory volume, because it contains only unique items. Object pool allows to improve performance but leads to high memory consumption.