# UniversitySprotsCentreApp

## Coursework assignment of 7COM1025-0105-2021 - Programming for Software Engineers

• The University Sports Centre (USC) needs software for managing the bookings
of group exercise lessons made by the students.

• The centre offers different group exercise lessons on both Saturday and Sunday.

• The lessons could be Yoga, Zumba, Aquacise, Box Fit, Body Blitz, etc. Each lesson can accommodate 4 students at most.

• For either day (Saturday or Sunday), there are 3 lessons per day: 1 in the morning, 1 in the afternoon, 1 in the evening.

• The price of each lesson is different. The lesson price for the same exercise will remain the same even if they run at a different time.

• A student who wants to book a lesson needs to first check the timetable and then select a lesson on a day. A student can check the timetable by two ways:

• one is by specifying the day (must be Saturday or Sunday);

• the other is by specifying the exercise name.

• Students are allowed to change a booking, provided there are still spaces
available for the newly selected lesson. A student can book as many lessons
as they want so long as there is no time conflict.

• After each group exercise lesson, students are able to write a review of the
lesson they have attended and provide a numerical rating of the lesson
ranging from 1 to 5 (1: Very dissatisfied, 2: Dissatisfied, 3: Ok, 4: Satisfied, 5: Very Satisfied). The review and rating information will be recorded in the system.

• After four weeks (four weekends), the software system must print:

• a report containing the number of students per group exercise lesson on each day, along with the average rating;

• a report containing the group exercise which has generated the highest income, counting all the same exercise lessons together.

• In your final deliverable, provide data covering at least 4 different
types of group exercise lessons, 10 students, and 20 reviews (with
rating), which can then be displayed in the output reports. You need
to design at least 8 weekends of timetable (i.e., 48 lessons) by
yourself.

• Note: you do not need any kind of external database for this program.
The final program should be self-contained. The reports can be
printed to System.out, or output to a suitable GUI interface. You also
do not need any kind of security protocol. All the students may be
assumed to be pre-registered.• Your tasks:

1.  Create a class diagram, highlighting the main Java classes in the system
    and their associations. Include the attributes and key methods.
2.  Implement the system, using Junit tests to confirm the functionality.
3.  Write a short report (ideally around 8 pages) explaining your program.
    Discuss:
    a) Any assumptions made about the system, in addition to the above
    description.
    b) The overall structure and design of your program.
    c) Any design patterns/design principles used.
    d) The JUnit tests.
    e) Any refactoring used during the development of the system.
    We want to see your reflections over this small project.• Deliverables:
    A. Develop your code using bitbucket or other version control
    software. Take snapshots of your project repository and commit messages.
    Include the snapshots in your report.
    B. Submit to StudyNet:
4.  Your report with the UML class diagrams and snapshots
    of your version control commit messages in a single PDF document.
5.  An executable jar file, demonstrating your final system.
    The system should have some data preloaded (as
    described above).
6.  A zip-file containing the source code of your project.
    No references needed for your report.• We will test your program. Source code will be checked to confirm
    both that the work has been implemented by yourself, and its design.
    • UML Class diagram. (10 marks)
    • Working jar file. (40 marks)
    • Use of version control, with suitable commit messages. (5 marks)
    • Appropriate design and implementation. (30 marks)
    • Use of JUnit testing. (10 marks)
    • Report format and writing quality. (5 marks)• Ideally, your program will provide at least 5 functions in the format of
    command line interface (you can use GUI if you wish, but no extra
    marks given):
7.  Book a group exercise lesson
8.  Change a booking
9.  Attend a lesson
10. Monthly lesson report
11. Monthly champion exercise report
    Don’t forget that you program should be able to exit whenever there is
    no other option available.

        • Book a group exercise lesson
        • All are group lessons and up to 4 students are allowed for each lesson.
        • The system will prompt the user to select the way to check the timetable, one is by specifying the day (Saturday or Sunday) and the other is by specifying the exercise name.
        • If the user selects to specify the day, all three lessons on that day in your timetable will be displayed on the screen.
        • If the user selects to specify the exercise name, all the lessons of that exercise in the timetable will be displayed on the screen.
        • The user will then book into one lesson. If the new booking will not violate the lesson capacity constraint (i.e., the total student number is not more than 4), the booking is successful. Otherwise, the booking is not successful and the program returns to the main interface.
        • Ideally, you should provide two months’ lessons (covering 8 weekends) and this should be timetabled by yourself including the price information.
        • No repeated booking (i.e., one student cannot book the same lesson twice)
        • Change a booking
        • The system will prompt the user to specify which booking they want to make a change (maybe through a booking ID)
        • The user will select a new lesson (can be different type of exercise). The system will do the same checking on the capacity constraint. If no violation, the change is successful. Note that this is a booking change so the same booking ID will be kept. If there is a violation, the change is not successful and the user needs to select another new lesson or the program returns to the main interface.
        • Do not forget to release one place from the previously booked lesson if the change is successful.
        • Cancelling a booking can be incorporated in this function. Don’t forget to release one place if cancelling is successful. The booking ID of a cancelled booking will not be reused.
        • Attend a lesson (writing a review and providing a numerical rating can be incorporated in this function)
        • A review are a few sentences/words about the lesson
        • Rating is to give a number ranging from 1 to 5.
        • Ideally, each booking will have a status. When it is booked (before attending), the status is "booked". When it is attended, the status is changed to "attended". When it is changed but not attended, the status is "changed". When it is cancelled, the status is “cancelled”.
        • Monthly lesson report
        • Ideally, when the user selects this function, the system will prompt the user to input a month number (e.g., 12 for December). This report will then list the statistics for each lesson in the 4 weekends of that month:
        • the number of students, along with the average rating of the lesson;
        • Monthly champion exercise report
        • Ideally, when the user selects this function, the system will prompt the user to input a month number (e.g., 12 for December).
        • a report showing which group exercise has generated the highest income, counting all the same types of exercise lessons together.
        • You need to show the group exercise name and the total income amountOther points
        • For “data covering at least 4 different types of group exercise lessons, 10 students, and 20 reviews (with rating)", you can hard code the data into your program or you can read the data from an external file.
        • UML diagram is included in your report, not a separate file.
        • In the report, provide some snapshots of your commit messages to
        show that you have used Version Control.
        • For JUnit test, since there are only 10 marks assigned to it, you can
        just pick up about two key methods (not getter or setter methods)
        from each Java class and then write the test cases for them. In total,
        you should have 10 test cases. To save your time, you don't need to
        write test cases for every method in every Java class.• No real time in this system: no past, no present, no future. So you
        don’t need to compare the time.
        • A lesson is attended by the user selecting the corresponding function
        • A student who has booked a lesson but not attended it cannot be
        accounted into the number
