from tkinter import *
import math

# ---------------------------- CONSTANTS ------------------------------- #
PINK = "#e2979c"
RED = "#e7305b"
GREEN = "#9bdeac"
YELLOW = "#f7f5dd"
FONT_NAME = "Courier"
WORK_MIN = 25
SHORT_BREAK_MIN = 5
LONG_BREAK_MIN = 20
reps = 0
TICK = "✔"
timer = None


# ---------------------------- TIMER RESET ------------------------------- #

def timer_reset():
    global timer
    global reps
    canvas.itemconfig(timer_text, text="00:00")
    window.after_cancel(timer)
    tick.config(text="")
    timer_title.config(text="Timer")
    reps = 0


# ---------------------------- TIMER MECHANISM ------------------------------- #

def start_timer():
    global reps
    ticker = ""
    work_sec = WORK_MIN * 60
    short_break_sec = SHORT_BREAK_MIN * 60
    long_break_sec = LONG_BREAK_MIN * 60

    if reps == 7:
        timer_title.config(text="Break", fg=RED)
        count_down(long_break_sec)
        tick.config(text="")
        reps = 0
    elif reps % 2 == 0:
        timer_title.config(text="Work", fg=GREEN)
        count_down(work_sec)
        reps += 1
    else:
        ticker = ticker.join(TICK)
        tick.config(text=TICK)
        timer_title.config(text="Break", fg=PINK)
        count_down(short_break_sec)
        reps += 1


# ---------------------------- COUNTDOWN MECHANISM ------------------------------- #

def count_down(count):
    count_min = math.floor(count / 60)
    count_sec = count % 60
    if count_sec < 10:
        count_sec = f"0{count_sec}"

    if count_min < 10:
        count_min = f"0{count_min}"

    canvas.itemconfig(timer_text, text=f"{count_min}:{count_sec}")
    global timer
    if count > 0:
        timer = window.after(1000, count_down, count - 1)
    else:
        start_timer()


# ---------------------------- UI SETUP ------------------------------- #
# window
window = Tk()
window.title("Pomodoro")
window.config(padx=100, pady=50, bg=YELLOW)

# Timer_Label
timer_title = Label(text="TIMER", font=(FONT_NAME, 20, "bold"), fg=GREEN, bg=YELLOW)
timer_title.grid(column=1, row=0)

# Canvas
canvas = Canvas(width=200, height=224, bg=YELLOW, highlightthickness=0)
tomato_img = PhotoImage(file="tomato.png")
canvas.create_image(100, 112, image=tomato_img)
timer_text = canvas.create_text(100, 130, text="00:00", fill="white", font=(FONT_NAME, 35, "bold"))
canvas.grid(column=1, row=1)

# Buttons
start_button = Button(text="Start", highlightthickness=0, command=start_timer)
start_button.grid(column=0, row=2)

reset_button = Button(text="Reset", highlightthickness=0, command=timer_reset)
reset_button.grid(column=2, row=2)

# Tick
tick = Label(font=(FONT_NAME, 10, "bold"), fg=GREEN, bg=YELLOW)
tick.grid(column=1, row=3)

window.mainloop()
