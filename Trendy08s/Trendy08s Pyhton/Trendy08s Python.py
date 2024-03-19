import re

def validar_tarjeta(tarjeta):
    # Expresión regular para validar el formato de la tarjeta de crédito
    patron_tarjeta = re.compile(r'^[0-9]{16}$')
    return patron_tarjeta.match(tarjeta)

def registrar_usuario(usuarios):
    while True:
        nuevo_usuario = input("Elige un nombre de usuario: ")
        if nuevo_usuario in usuarios:
            print("El nombre de usuario ya está en uso. Por favor, elige otro.")
        else:
            contraseña = input("Elige una contraseña: ")
            tarjeta = input("Introduce tu número de tarjeta de crédito (16 dígitos): ")
            if validar_tarjeta(tarjeta):
                usuarios[nuevo_usuario] = {"contraseña": contraseña, "tarjeta": tarjeta}
                print("Te has registrado correctamente.")
                break
            else:
                print("El número de tarjeta no es válido. Inténtalo de nuevo.")

def iniciar_sesion(usuarios):
    while True:
        usuario = input("Usuario: ")
        contraseña = input("Contraseña: ")

        if usuario in usuarios and usuarios[usuario]["contraseña"] == contraseña:
            print("\n¡Inicio de sesión exitoso!")
            break
        else:
            print("Credenciales incorrectas. Inténtalo de nuevo.")

if __name__ == "__main__":
    usuarios = {}  # Almacenamiento de usuarios y contraseñas

    while True:
        opcion = input("¿Qué deseas hacer? (1: Registrar nuevo usuario, 2: Iniciar sesión, 3: Salir): ")

        if opcion == "1":
            registrar_usuario(usuarios)
        elif opcion == "2":
            iniciar_sesion(usuarios)
        elif opcion == "3":
            print("¡Hasta luego!")
            break
        else:
            print("Opción no válida. Inténtalo de nuevo.")