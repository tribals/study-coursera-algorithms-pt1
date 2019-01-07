# What is it?

This is my attepmt (third, to be precise) to take Coursera's exciting "Algorithms" course by Robert Sedgewick. I always felt that I'm missing something important in programming field, so I trying to fill the gap.

In this project I combine some practices which are always kinda "you-can-do-better" and "newer-stop-practicing". These practices are as follows:

1. First, and foremost: TDD. _*You (and I, of course) should always write tests first!*_. Print it. Put it on your pierglass, monitor, or something similar. This is your mantra. So, for each topic I'll study in this course I'll try to write test first, then make it pass, then refactor. Seems that it will be wery curious. :blush:

2. "Learn new programming language every year or half-year (or month, or in a time that suits best for you)". The original course is in Java programming language. I don't like Java and don't want to learn it. To me, it is very wordly, shackled, offers less than it promises and contra-object-oriented in the first place (I'm _true_ objects adherent, if you want). So, I decided to take something less deterring and not so noisy, and Kotlin is worth to try it in contrast to Java, and it gives you full interoperability in the first place.

3. Continous Ingegration/Continous Delivery. "What?", may you ask. "What are you deploying at all?". But CI/CD is exactly about this - your code should be _always in working state_. You should be able co clone repo, type _one_ command, and voilà - everything just works. I'm deploying a project that demonstrates implementation of various basic algorithms, and you (and I) should be able to ensure that they all are working.

4. Project management with `git` (and, especially, with `git flow`) will never hurts you. I decided to do each weak's exercises in one feature named according to  week's number, e. g. `week-1`, and so on.

# How to use it?

The usage should be as straightforward as it can be at all. Here it is:

* clone repo;
* use [gradle wrapper](https://docs.gradle.org/current/userguide/gradle_wrapper.html) to run tests:

    ```console
    $ ./gradlew clean test # (Linux, MacOS)
    ```

    ```console
    > gradlew.bat clean test # (Microsoft)
    ```

* see all tests passes.

That's it!
