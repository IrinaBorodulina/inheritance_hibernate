Два варианта сохранения в бд двух сущностей, имеющих общего родителя.
В директории one_table создается одна родительская таблица, 
в ней определяется колонка с типом объекта - дескриминатор (@DiscriminatorColumn).
В директории two_tables создаются две таблицы для каждого дочернего типа. 
Однако можно производить сохранение данных и поиск через репозиторий родительского типа, 
он делает объединение результатов двух запросов через union.