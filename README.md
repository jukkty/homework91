После ознакомления с документацией VK, мной были добавлены следующие строки объекта ` private int signerId`, `private int ownerID`, `private boolean markedAsAds`. Были добавлены именно эти поля, так как по сравнению с остальными, представленными в Vk документации, они являются максимально важными и описывающими важные блоки будущего объекта.
Почему-то в vk значения Да/Нет рекомендуют указывать в integer 0/1. В случае с java, было бы удобнее сохранять это в boolean true/false.
