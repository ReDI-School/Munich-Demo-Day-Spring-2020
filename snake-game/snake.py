import turtle
import time
import random
x=20
win = turtle.Screen()
win.setup(width=600,height=600)
win.bgcolor("light green")
win.title("Snake game with Python Turtle")
turtle.goto(0,0)
time.sleep(0.3)
kopf=turtle.Turtle()
def Kopf():
  kopf.shape("square")
  kopf.penup()
  kopf.forward(x)
def Koerper():
  koerper.shape("square")
  koerper.penup()
  
def Schwanz():
  schwanz.shape("square")
  schwanz.penup()
  
point = turtle.Turtle()
point = turtle.Turtle()
point.speed(0)
point.shape("square")
point.color("black")
point.penup()
point.hideturtle()
point.goto(0, 260)
point.write("Score: 0  High Score: 0", align="center")
kopf.penup()
kopf.setx(40)
kopf.sety(0)
koerper=turtle.Turtle()
koerper.penup()
koerper.setx(20)
koerper.sety(0)
schwanz=turtle.Turtle()
schwanz.penup()
schwanz.setx(0)
schwanz.sety(0)
def up():
    if kopf.heading()!=270:
        kopf.setheading(90)
        kopf.penup()
  
def down():
    if kopf.heading()!=90:
        kopf.setheading(270)
        kopf.penup()
  
def right():
    if kopf.heading()!=180:
        kopf.setheading(0)
        kopf.penup()
 
def left():
    if kopf.heading()!=0:
        kopf.setheading(180)
        kopf.penup()
 
score=0
max_score=100
essen=turtle.Turtle()
def Essen():
    essen.shape("circle")
    essen.color("red")
    essen.penup()
    essen.shapesize(0.8, 0.8)
    
win.listen()
win.onkey(up,"Up")
win.onkey(down,"Down")
win.onkey(right,"Right")
win.onkey(left,"Left")
while True:
    Schwanz()
    Koerper()
    aktuellKoerperx,aktuellKoerpery = koerper.position()
    schwanz.setx(aktuellKoerperx)
    schwanz.sety(aktuellKoerpery)
    aktuellKopfx, aktuellKopfy= kopf.position()
    koerper.setx(aktuellKopfx)
    koerper.sety(aktuellKopfy)
    Kopf()
    Essen()
    point.clear()
    point.write("Score: {}  High Score: {}".format(score, max_score), align="center",font=20)
    if kopf.distance(essen)<20:
        randomx = random.randint(-290, 290)
        randomy = random.randint(-290, 290)
        essen.goto(randomx, randomy)
        score += 10
        if score > max_score:
            max_score = score
        point.clear()
        point.write("Score: {}  High Score: {}".format(score, max_score), align="center",font=20)
    
    if kopf.xcor() > 290 or kopf.xcor() < -290 or kopf.ycor() > 290 or kopf.ycor() < -290:
        time.sleep(1)
        kopf.goto(0, 0)
        kopf.direction = "stop"
    time.sleep(0.5)
turtle.done()
# turtle.mainloop() 