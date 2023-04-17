package javaders.day43Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) {

        Course turkishDay = new Course("Turkish Daytime QA", 213, "Spring", 97);
        Course turkishNight = new Course("Turkish Nighttime QA", 245, "Winter", 98);
        Course englishDay = new Course("English Daytime Java Dev", 121, "Spring", 91);
        Course englishNight = new Course("English Nighttime Java Dev", 137, "Winter", 95);

        List<Course> courseList = new ArrayList<>();
        courseList.add(turkishDay);
        courseList.add(turkishNight);
        courseList.add(englishDay);
        courseList.add(englishNight);

        System.out.println(isAvgScoreGreaterThanANumber(courseList, 90));

        System.out.println(isAnyCoursNameContainsQa(courseList, "QA"));

        System.out.println(getCourseNamesWhosAvgMaz(courseList));

        System.out.println(getCourseBetterThanLastTwo(courseList));

        System.out.println(getHighestThird(courseList));

        System.out.println(getCourseWhoseRegisteredStdLessThanNumber(courseList,150));
    }

    //ex-1 : Tum average scor'larin 90'dan buyuk olup olmadigini kontrol eden methodu olusturunuz.

    public static boolean isAvgScoreGreaterThanANumber(List<Course> courseList, int avg) {

        return courseList.stream().
                allMatch(t -> t.getAverageScore() > avg);
    }

    //ex-2: En az bir kurs isminin QA icerip icermedigini kontrol eden methodu olusturunuz.

    public static boolean isAnyCoursNameContainsQa(List<Course> courseList, String word) {
        return courseList.stream().
                anyMatch(t -> t.getCourseName().contains("QA"));
    }

    //ex-3 : En yuksek average score sahip kurs ismini veren kodu yaziniz.

    public static String getCourseNamesWhosAvgMaz(List<Course> courseList) {
        Course course = courseList.stream().
                sorted(Comparator.comparing(Course::getAverageScore).reversed()).
                findFirst().
                get();
        return course.getCourseName();
    }

    //ex-4 : Average score'u en dusuk olan ilk iki course disindaki tum kurslari return eden methodu olusturunuz.
    public static List<Course> getCourseBetterThanLastTwo(List<Course> courseList) {
        return courseList.stream().
                sorted(Comparator.comparing(Course::getAverageScore)).
                skip(2).//ilk isinini bos gec dedik
                        collect(Collectors.toList());
    }

    //ex-5 : Average score'u ustten ucuncu olan kursu veren methodu olsuturunuz.

    public static Course getHighestThird(List<Course> courseList) {
        return courseList.stream().
                sorted(Comparator.comparing(Course::getAverageScore).reversed()).//yukseklerin en onde olmasi icin reversed yaptik
                        skip(2).//ilk ikisini es gecmeliyiz ki ucuncuden devam etmeliyiz.
                        limit(1). //geri kalanlari ele alir
                        collect(Collectors.toList()).
                get(0);

    }

    //ex-6: ogrenci sayisi 150'den az oaln kurslari return eden methodu olsuturunuz.
    public static List<Course> getCourseWhoseRegisteredStdLessThanNumber (List<Course> courseList, int numOfStd){
        return courseList.stream().
                filter(t->t.getNumOfStudents()<numOfStd).
                collect(Collectors.toList());
    }
}
