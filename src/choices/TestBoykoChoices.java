package choices;

import java.util.Arrays;
import java.util.List;

public class TestBoykoChoices {
    public static final List<String> AGGRESS = Arrays.asList(
            "дружелюбен, не наносит вреда себе и другим",
            "грубоват, замкнут, но не наносит вреда себе и другим",
            "грубо, фамильярно разговаривает, публично оскорбляет других, ломает или портит вещи, попадает в аварии, случайно наносит себе порезы, травмы",
            "высказывает угрозы, дерётся; когда волнуется, может сам себя порезать, прижечь сигаретой; может быть статья за неумышленное нанесение повреждений людям или имуществу (115 или 118 УК РФ)",
            "частые угрозы, драки, причинение другим и себе физического вреда (БДСМ практики, самопорезы, употребление алкоголя с целью «убить печень» и т.д.); может быть статья за умышленное причинение вреда другим людям или порчи имущества (111 УК РФ)"
    );
    public static final List<String> ALARM = Arrays.asList(
            "ровный фон настроения",
            "настроение немного снижено, лёгкая тревога или раздражительность; не жалуется на плохое настроение, но при расспросе оно выявляется",
            "жалуется на возникающее время от времени плохое настроение, тревогу, раздражительность",
            "плохое настроение, тревога, резкие колебания настроения, страдание на лице, в мимике, позе",
            "постоянно плохое настроение («все плохо», «все черное»), плохое самочувствие, плохой сон, аппетит, сильная тревога, апатия («все безразлично», «ничего не хочу»), лицо без мимики, подавленный вид и голос"
    );
    public static final List<String> MEMORY_DISORDER = Arrays.asList(
            "ясное мышление, хорошая память, хорошее понимание речи специалиста и умственная работоспособность",
            "ухудшение памяти и мышления при долгой нагрузке, забывает важную информацию и не может ее вспомнить, отвлекается, «выпадает» из беседы ",
            "вялое мышление, много говорит о несущественных деталях, нарушена память на текущие события или на события прошлого, утомляется при нагрузке",
            "застревает на одной мысли и постоянное ее повторяет, или постоянно перескакивает с мысли на мысль; временами не понимает, что говорит специалист; теряется, когда надо проанализировать и решить ситуацию; примитивно судит о жизни",
            "не может вспомнить недавние события, с трудом запоминает новую информацию; не может сосредоточить внимание, понять, что ему говорит специалист; ошибочно размышляет или вообще не способен к размышлению; ведет себя так, словно не понимает, где находится и что происходит; не может планировать даже ближайшее будущее"
    );
    public static final List<String> CRITICISM = Arrays.asList(
            "полностью осознает свое состояние; может смотреть на себя и свою зависимость со стороны; видит последствия своих действий",
            "частично понимает своё состояния, поведение и заболевание; не всегда может посмотреть на себя со стороны; не видит связи между своими действиями и последствиями",
            "поверхностное понимание своего положения: на словах может говорить о своей ответственности и анализировать свое поведение, но это мало влияет на результат",
            "сниженное понимание своего состояния и поведения; не видит связи между своим поведением и его последствиями",
            "стойкая утрата понимания своего состояния и поведения"
    );
    public static final List<String> SELF_SERVICE = Arrays.asList(
            "содержит себя, свою одежду, жилище в чистоте и порядке",
            "кратковременные затруднения в самообслуживании, о которых известно только очень близким людям",
            "способен к самообслуживанию, но делает это по минимуму: одежда может быть с небольшими пятнами и измятой, волосы не расчесаны, но относительно чистые, запаха нет",
            "периодически возникают трудности в самообслуживании, одежда и внешний вид не опрятные, но базовые навыки гигиены сохранны",
            "не соблюдает правил гигиены и не поддерживает порядок в жилище, не справляется с самообслуживанием и нуждается в помощи других людей"
    );
    public static final List<String> WORK_ACTIVITY = Arrays.asList(
            "есть постоянная работа, понимает необходимость работать, положительно оценивается коллегами",
            "есть постоянная работа, понимает необходимость работать; если затруднения в работе возникают, то они кратковременны и о них известно только близким людям",
            "конфликты с коллегами по работе, не приводящие к потере работы; периодические прогулы на работе (в том числе из-за похмелья); с трудом удерживается на работе, часто меняет работу, но не остается без неё",
            "выбирает работу в «пьющем» коллективе или не способен сохранить рабочее место; вместо постоянной работы разовые подработки",
            "нет работы, не способен её самостоятельно найти и выполнять"
    );
    public static final List<String> FRIENDS = Arrays.asList(
            "поддерживает контакты с друзьями/знакомыми, способен к эмоциональной привязанности",
            "временные затруднения в контактах с друзьями/знакомыми, хотя есть эмоциональная привязанность",
            "сужение контактов, общается с людьми, злоупотребляющими алкоголем или наркотиками, проблемы очевидны любому человеку",
            "частые конфликты с друзьями/знакомыми, родственниками; круг общения снижен до уровня необходимого (чаще потребительского)",
            "не способен поддерживать контакты с друзьями, знакомыми; отсутствуют социальные связи"
    );
    public static final List<String> FAMILY_RELATION = Arrays.asList(
            "есть семья, желание её иметь и сохранять",
            "есть семья и желание её сохранить, хотя имеются кратковременные трудности в отношениях",
            "конфликты с родственниками, членами семьи, не приводящие к потере контакта с семьей",
            "частые конфликты с членами семьи и близкими, приводящие к долгой разлуке, потере семьи",
            "семьи нет, отсутствует желание иметь и сохранять семью"
    );
    public static final List<String> CHILD_PARENT = Arrays.asList(
            "поддерживает престарелых родителей/несовершеннолетних детей финансово и психологически",
            "есть кратковременные трудности в отношениях с родителями/детьми, о которых известно только очень близким людям",
            "отношение к родителям/детям противоречивое: то заботится, то как будто «забывает» о своей ответственности",
            "формальное отношение к родителям/детям, нет эмоциональной привязанности к ним, недостаточно заботится о детях, например, недоплачивает алименты, временами не приносит зарплату, тратит деньги на свои нужды, даже если дети нуждаются в необходимом",
            "не заботится о членах семьи, детях даже на минимальном уровне"
    );
    public static final List<String> LEISURE = Arrays.asList(
            "в свободное время занимается разнообразными социально-приемлемыми интересами и деятельностью",
            "способен планировать свое свободное время, имеет стабильные интересы, а затруднения в этом носят кратковременный характер",
            "довольно бедная сфера  интересов, снижен познавательный интерес, нет стойких интересов, отдых в основном пассивный и однообразный",
            "свободное время проводит пассивно (например, просмотр телевизора), не знает, чем себя занять; иногда может употреблять алкоголь или наркотики, курить, чтобы занять время; говорит о необходимости «убивать время»",
            "свободное время посвящено поиску и употреблению алкоголя или наркотиков, другие интересы и увлечения отсутствуют"
    );
}