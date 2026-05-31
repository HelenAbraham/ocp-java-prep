A structure like this could work really well:

java-practice-hub/
│
├── README.md
├── getting-started/
│
├── beginner/
│   ├── variables/
│   ├── loops/
│   ├── methods/
│   └── arrays/
│
├── intermediate/
│   ├── oop/
│   ├── collections/
│   ├── exceptions/
│   └── streams/
│
├── ocp-style/
│   ├── predict-output/
│   ├── will-it-compile/
│   ├── tricky-generics/
│   └── lambdas/
│


======================
java-practice-hub/
├── README.md
├── GETTING_STARTED.md
├── CONTRIBUTING.md
├── pom.xml
├── .gitignore
├── .gitlab-ci.yml
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/yourgroup/javahub/
│   │           ├── basics/
│   │           │   ├── ReverseString.java
│   │           │   └── FizzBuzz.java
│   │           ├── oop/
│   │           │   └── BankAccount.java
│   │           ├── collections/
│   │           │   └── CountWords.java
│   │           ├── streams/
│   │           │   └── FilterStudents.java
│   │           └── ocp/
│   │               └── VarTrap.java
│   │
│   └── test/
│       └── java/
│           └── com/yourgroup/javahub/
│               ├── basics/
│               │   ├── ReverseStringTest.java
│               │   └── FizzBuzzTest.java
│               ├── oop/
│               │   └── BankAccountTest.java
│               ├── collections/
│               │   └── CountWordsTest.java
│               ├── streams/
│               │   └── FilterStudentsTest.java
│               └── ocp/
│                   └── VarTrapTest.java
│
├── challenges/
│   ├── beginner/
│   │   └── reverse-string.md
│   ├── oop/
│   │   └── bank-account.md
│   ├── collections/
│   │   └── count-words.md
│   ├── streams/
│   │   └── filter-students.md
│   └── ocp-style/
│       └── will-it-compile.md
│
└── solutions/
    ├── basics/
    ├── oop/
    ├── collections/
    ├── streams/
    └── ocp/


src/main/java = code learners complete
src/test/java = tests that check their answers
challenges/ = readable instructions/questions
solutions/ = optional model answers, maybe protected or hidden at first
README.md = what this repo is
CONTRIBUTING.md = how to submit work
.gitlab-ci.yml = auto-runs tests when they push

#