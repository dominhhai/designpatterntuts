## The difference between the Facade, Proxy, Adapter, and Decorator?

Adapter adapts a given class/object to a new interface. In the case of the former, multiple inheritance is typically employed. In the latter case, the object is wrapped by a conforming adapter object and passed around. The problem we are solving here is that of non-compatible interfaces.

Facade is more like a simple gateway to a complicated set of functionality. You make a black-box for your clients to worry less i.e. make interfaces simpler.

Proxy provides the same interface as the proxied-for class and typically does some housekeeping stuff on its own. (So instead of making multiple copies of a heavy object X you make copies of a lightweight proxy P which in turn manages X and translates your calls as required.) You are solving the problem of the client from having to manage a heavy and/or complex object.

Decorator is used to add more gunpowder to your objects (note the term objects -- you typically decorate objects dynamically at runtime). You do not hide/impair the existing interfaces of the object but simply extend it at runtime.

Now that you have decorator involved, you will probably want to know why the emphasis on the word object -- some languages (like Java) simply don't allow virtual inheritance (i.e. multiple inheritance as C++ does) to allow you to accomplish this at compile time.

Since we have dragged in multiple inheritances (and the dreaded diamond) you will look out for mixins -- which are ordered linear chaining of interfaces to get around the problems of multiple inheritance. However, mixins don't mix that well. And we end up with traits -- yes those stateless little blobs of behavior that you see pop-up all the time in template parameters in C++. Traits try to address the issues of composition and decomposition of behavior in an elegant manner while not going either for multiple inheritances or ordered chaining.