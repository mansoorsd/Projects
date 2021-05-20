
import time
from turtle import Screen, Turtle
from player import Player
from car_manager import CarManager
from car_manager import CarManager
from scoreboard import Scoreboard
SPEED = 0.1

screen = Screen()
screen.setup(width=600, height=600)
screen.tracer(0)
player = Player()
cars = CarManager()
score = Scoreboard()

screen.listen()
screen.onkeypress(player.move_up, "Up")
screen.onkeypress(player.move_down, "Down")

game_is_on = True
while game_is_on:
    time.sleep(SPEED)
    screen.update()
    cars.create_cars()
    cars.move_car()
    # detect collision

    for car in cars.cars:
        if car.distance(player) < 20:
            score.game_over()
            game_is_on = False

    # detect finish line
    if player.finish():
        player.go_to_start()
        cars.level_up()
        score.level_up()
screen.exitonclick()
