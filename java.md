# TRIAL EXAM: Programming Basics

### Getting Started
 - Fork this repository under your own account
 - Clone the forked repository to your computer
 - Commit your progress frequently and with descriptive commit messages
 - All your answers and solutions should go in this repository

### What can I use?
- You can use any resource online, but **please work individually**
- **Don't just copy-paste** your answers and solutions, use your own words instead.
- **Don't push your work** to GitHub until your mentor announces that the time is up


# Tasks
## 1-4. Complete the following tasks: (~180 mins)

- [Seconds](seconds/Seconds.java)
- [Count A-s](countas/CountAs.java)
- [Pirates](pirates/Pirates.java)
- [Box](box/Box.java)

### Acceptance criteria
The application is accepted if:
- The solution works according to specification [1p each]
- The solution follows [styleguide](https://github.com/greenfox-academy/teaching-materials/blob/master/styleguide/java.md) [1p]
- Has proper error handling where the specification says it [1p each]
- Has the correct loops, methods, filters [1p each]
- The code is clean, without unnecessary repetition, and with descriptive names [1p each]
- You commit frequently with descriptive commit messages [1p]

## 5. Question time! (~15 mins) [2p]

### How can you generate a random number? [2p]
#### Your answer:
##### (_casting type_) (Math.random() * _range_) + _minimum value_
The random() static function of the Math class generates a double typed random number between 0 and 1, including the former and excluding the latter. We can stretch or contract this range by a multiplication. (Math.random() * 10 generates numbers between 0 and 10.)
If we want more distinct, for example integer type values, we can cast these doubles by putting "(int)" before the function. ((int) (Math.random() * 10) will give a random whole number between 0 and 9.)
If we don't want our range to start from zero up, we can modify the statement by simply adding the bottom of the range. ((int) Math.random() * 10 - 5 will give values from -5 to +4.
