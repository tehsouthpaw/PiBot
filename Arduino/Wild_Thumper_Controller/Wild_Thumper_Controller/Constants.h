//=================================== MODE OF COMMUNICATIONS ========================================================================

#define Cmode                1     // Sets communication mode: 0=RC    1=Serial    2=I2C
#define Brate           115200     // Baud rate for serial communications



//=================================== RC MODE OPTIONS ===============================================================================

#define Mix                  1     // Set to 1 if L/R and F/R signals from RC need to be mixed
#define Leftcenter        1500     // when RC inputs are centered then input should be 1.5mS
#define Rightcenter       1500     // when RC inputs are centered then input should be 1.5mS
#define RCdeadband          35     // inputs do not have to be perfectly centered to stop motors
#define scale               12     // scale factor for RC signal to PWM



//=================================== BATTERY CHARGER SETTINGS ======================================================================

#define batvolt            487     // This is the nominal battery voltage reading. Peak charge can only occur above this voltage.
#define lowvolt            410     // This is the voltage at which the speed controller goes into recharge mode.
#define chargetimeout   300000     // If the battery voltage does not change in this number of milliseconds then stop charging.



//=================================== H BRIDGE SETTINGS =============================================================================

#define Leftmaxamps        800     // set overload current for left motor 
#define Rightmaxamps       800     // set overload current for right motor 
#define overloadtime       100     // time in mS before motor is re-enabled after overload occurs



//=================================== PAN/TILT SETTINGS ==============================================================================

#define minPan             0
#define maxPan             180
#define minTilt            0
#define maxTilt            140
