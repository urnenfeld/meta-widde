DESCRIPTION = "Interface to use Pushetta API with Python. Pushetta is a service made to make it simple send push notifications from/to (almost) any device. It can be used to send a notifications from Arduino to iPhone, from Raspberry Pi to Android, from web page to Beaglebone and many others."
HOMEPAGE = "https://github.com/guglielmino/pushetta-py"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;beginline=8;endline=8;md5=8227180126797a0148f94f483f3e1489"
SRCNAME = "pushetta"

S = "${WORKDIR}/${SRCNAME}-${PV}"


# This patch avoid the inclusion of the mqtt and future package
# Therefore subscription is not working with this recipe
# Try creating antoher recipe in the future: https://pypi.python.org/pypi/paho-mqtt/1.1
SRC_URI = "http://pypi.python.org/packages/source/p/pushetta/${SRCNAME}-${PV}.tar.gz \
	   file://avoid_packages.patch"

inherit setuptools

# need uuid urllib & json
RDEPENDS_${PN} += "python-netclient python-json"

SRC_URI[md5sum] = "fa7a741800b88b89bcb4fbeee3b03f61"
SRC_URI[sha256sum] = "75d69d672f3cea8453a36f0ee638c64079d93c27f52f3b96d2bf7752ec034cf6"
