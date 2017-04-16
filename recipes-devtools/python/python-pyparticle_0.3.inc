SUMMARY = "Python Wrapper around the Particle (particle.io)"
HOMEPAGE = "https://github.com/urnenfeld/pyparticle"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2c8a6045b33023c84d0619f8730af199"

SRC_URI = "https://github.com/urnenfeld/pyparticle/archive/${PV}.tar.gz"

PACKAGE="pyparticle"
S = "${WORKDIR}/${PACKAGE}-${PV}"

SRC_URI[md5sum] = "8e87d12de0fbd632b093920e2b3c4d54"
SRC_URI[sha256sum] = "5514721b2406eb43e5f87b17857a48d5956928104d89ef0dbc6d506143b9d616"
