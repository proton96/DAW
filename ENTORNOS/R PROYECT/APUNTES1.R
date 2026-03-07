## Asi se comenta en R

# INSTALAR E IMPORTAR LIBRERIAS -------------------------------------------
install.packages("rstudioapi")
library(rstudioapi) 

getwd() ##Esto me indica en que carpeta estoy 
setwd("C:/Users/IK/Documents/DAW") ##Esto me deja ir al directorio que yo quiera 
getwd()

# Variables y operadores --------------------------------------------------

a <- 2
b <- 5

a+b
a-b
a/b
a*b

## Raiz cuadrada
sqrt(b) 

## Declaro variables y me lanza si es verdadero o falso 

na <- NA
null <- NULL 

is.na(na)
is.null(null)

d <- 0 
d
!d
b==0
b!=0
b==5

# Condicionales y bucles  -------------------------------------------------

if(d==0){
  print ("de es 0")
} else {
  print("d es distinto de 0")
}

1:10
10:2

seq(1,10,2)

for (i in 1:5) {
  print(i)
  
}

i <- 10


while (i>0) {
  print(i)
  i <- i-2
}

# Funciones  --------------------------------------------------------------

paste("Hola" , "Carlos", "Martin", sep= "_")


comprobador_0 <- function(num){
  if (num==0){
    print (paste(num, "es 0"))
  } else {
    print(paste(num, "es distinto de 0"))
  }
}

comprobador_0(0)
comprobador_0(1)

iterador_rango <- function(ini,fin){
  for (i in ini:fin) {
    comprobador_0
  }
}

iterador_rango(-2, 2)



# Estructuras de datos  ---------------------------------------------------

v <- c(1,10,20,40)
v
v[1]
v[2]
v[3]
v[4]


v2 <- 10:1
length(v2)

v3 <- c(4,1,3,5)
order(v3)
v3[order(v3)]

length(v)== length(v3)
v*v3
v**v3

## R recicla 
v4 <- 1:8

v2+v
v+v2

## Declarar matrices con matrix
m <- matrix(1:9, nrow = 3, ncol = 3)
m
m[1,]
m[,1]
m[2,2]
m2 <- matrix(2, nrow = 3, ncol = 3)
m2

## Operaciones con matrices 
m+m2
m-m2
m*m2
m/m2

##Dataframes

df1 <- data.frame(m)
df1
names(df1)
names(df1) <- c("Altura", "Peso", "MEDIDA PIE")
names(df1)
df1$Altura

rownames(df1)
rownames(df1) <- c("PEPE", "JUAN", "PAULA")
rownames(df1)

df1


df_alumnos <- data.frame(
  Nombre=c("Carlos", "Angel", "Nuria"),
  Sexo=c("H", "F", "N"),
  Edad=c(29,26,24)
)
df_alumnos

path <- "C:/Users/IK/Documents/DAW/"

write.csv(df_alumnos, paste(path,"datos_R.csv"), row.names = F)

# Iris --------------------------------------------------------------------

library(ISLR)
library(ggplot2)
library(caTools)
library(class)

iris

df <- iris
nrow(df)
dim(df)
str(df)
any(is.na(df))

ggplot(df, aes(Sepal.Width, Sepal.Length)) +
  geom_point(aes(col=Petal.Width,
                 size = Petal.Length,
                 shape=Species)) +
ggtitle("Longitud y anchura del sépalo segun la espesura") +
  labs(x="Anchura del sépalo",
       y="Longitud del sépalo")

ggsave("sepalo.png", width = 8, height = 6, bg= "white")

head(df)
tail(df)
head(df,3)

df.numeric <- df[,1:4]
specie <- df[,5]
df.scaled <- data.frame(scale(df.numeric))
sapply(df.scaled, var)
sapply(df.scaled, mean)

df.final <- cbind(df.scaled, specie)
sample <- sample.split(df.final$specie, SplitRatio = 0.75)
train.data <- subset(df.final, sample==TRUE)
test.data <- subset(df.final, sample==FALSE)

predicted.species <- knn(train.data[1:4],
                        test.data[1:4],
                        train.data[,5],
                        k=6)
sum(test.data[,5]==predicted.species) / dim(test.data)[1] 

library(shiny)

  
