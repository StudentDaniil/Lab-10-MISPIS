import ClasessUIS.*;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws ParseException {
        Faculty fkn = new Faculty("ФКН");
        Institute tozi = new Institute("ТоИЗи", "Университетская, 1");
        Institute is = new Institute("ИС", "Университетская, 1");
        Institute tst = new Institute("ЦТ", "Университетская, 1");
        Institute itu = new Institute("ИТУ", "Университетская, 1");
        Institute piit = new Institute("ПИИТ", "Университетская, 1");
        fkn.setInstitutes(new Institute[]{tozi, is, tst, itu, piit});

        ResearchAssociate employee1 = new ResearchAssociate(1, "Борисов Дмитрий Николаевич", "Заведующий кафедрой");
        ResearchAssociate employee2 = new ResearchAssociate(1, "Десятирикова Елена Николаевна", "Профессор");
        ResearchAssociate employee3 = new ResearchAssociate(1, "Ермаков Михаил Викторович","Старший преподователь");
        ResearchAssociate employee4 = new ResearchAssociate(1, "Зуев Сергей Алексеевич",  "Доцент");

        ResearchAssociate employee5 = new ResearchAssociate(1, "Сирота Александр Анатольевич", "Заведующий кафедрой");
        ResearchAssociate employee6 = new ResearchAssociate(1, "Храмов Владимир Юрьевич", "Профессор");
        ResearchAssociate employee7 = new ResearchAssociate(1, "Митрофанова Елена Юрьевна","Старший преподователь");
        ResearchAssociate employee8 = new ResearchAssociate(1, "Гаршина Вероника Викторовна",  "Доцент");
        is.setEmployees(new ResearchAssociate[]{employee1, employee2, employee3, employee4});
        tozi.setEmployees(new ResearchAssociate[]{employee5, employee6, employee7, employee8});
        Institute[] fkn_institutes = fkn.getInstitutes();

        System.out.println("Кафедры на факультете " + fkn.getName() + ":");
        for (Institute fknInstitute : fkn_institutes) {
            System.out.println(fknInstitute.getName());
        }
        System.out.println();

        ResearchAssociate[] isEmployees = is.getEmployees();
        System.out.println("Сотрудники кафедры " + is.getName() + ":");
        for (ResearchAssociate researchAssociate : isEmployees) {
            System.out.println(researchAssociate.getName());
        }

        System.out.println();

        ResearchAssociate[] toziEmployees = tozi.getEmployees();
        System.out.println("Сотрудники кафедры " + tozi.getName() + ":");
        for (ResearchAssociate researchAssociate : toziEmployees) {
            System.out.println(researchAssociate.getName());
        }

        System.out.println();

    }
}