## The difference between the Facade, Proxy, Adapter, and Decorator?

Adapter adapts a given class/object to a new interface. In the case of the former, multiple inheritance is typically employed. In the latter case, the object is wrapped by a conforming adapter object and passed around. The problem we are solving here is that of non-compatible interfaces.

Facade is more like a simple gateway to a complicated set of functionality. You make a black-box for your clients to worry less i.e. make interfaces simpler.

Proxy provides the same interface as the proxied-for class and typically does some housekeeping stuff on its own. (So instead of making multiple copies of a heavy object X you make copies of a lightweight proxy P which in turn manages X and translates your calls as required.) You are solving the problem of the client from having to manage a heavy and/or complex object.

Decorator is used to add more gunpowder to your objects (note the term objects -- you typically decorate objects dynamically at runtime). You do not hide/impair the existing interfaces of the object but simply extend it at runtime.

Now that you have decorator involved, you will probably want to know why the emphasis on the word object -- some languages (like Java) simply don't allow virtual inheritance (i.e. multiple inheritance as C++ does) to allow you to accomplish this at compile time.

Since we have dragged in multiple inheritances (and the dreaded diamond) you will look out for mixins -- which are ordered linear chaining of interfaces to get around the problems of multiple inheritance. However, mixins don't mix that well. And we end up with traits -- yes those stateless little blobs of behavior that you see pop-up all the time in template parameters in C++. Traits try to address the issues of composition and decomposition of behavior in an elegant manner while not going either for multiple inheritances or ordered chaining.

## The difference between Strategy and Command pattern

Typically the Command pattern is used to make an object out of what needs to be done -- to take an operation and its arguments and wrap them up in an object to be logged, held for undo, sent to a remote site, etc. There will tend to be a large number of distinct Command objects that pass through a given point in a system over time, and the Command objects will hold varying parameters describing the operation requested.

The Strategy pattern, on the other hand, is used to specify how something should be done, and plugs into a larger object or method to provide a specific algorithm. A Strategy for sorting might be a merge sort, might be an insertion sort, or perhaps something more complex like only using merge sort if the list is larger than some minimum size. Strategy objects are rarely subjected to the sort of mass shuffling about that Command objects are, instead often being used for configuration or tuning purposes.

Both patterns involve factoring the code and possibly parameters for individual operations out of the original class that contained them into another object to provide for independent variability. The differences are in the use cases encountered in practice and the intent behind each pattern.