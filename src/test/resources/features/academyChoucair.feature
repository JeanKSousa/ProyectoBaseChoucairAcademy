# Autor: Jean Sousa
  @stories
  Feature: Academy Choucair
    As a user, I want to learn how to automate in screenplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: Search for a automation course
    Given then brandon wants to learn automation at the academy Choucair
    |strUser|strPassword|
    |67608510|Choucair2021*|
    When he search for the course on the choucair academy platform
    |strCourse|
    |Advanced Level Test Manager|
    Then he find the course called
    |strCourse|
    |Advanced Level Test Manager|
