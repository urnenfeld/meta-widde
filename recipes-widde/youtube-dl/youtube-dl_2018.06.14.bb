DESCRIPTION = "youtube-dl is a command-line program to download videos from YouTube.com and a few more sites."
HOMEPAGE = "https://rg3.github.io/youtube-dl/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7246f848faa4e9c9fc0ea91122d6e680"
SRCNAME = "youtube-dl"

S = "${WORKDIR}/${SRCNAME}"

SRC_URI = "https://github.com/rg3/youtube-dl/releases/download/${PV}/${SRCNAME}-${PV}.tar.gz"

inherit setuptools3
SRC_URI[md5sum] = "5703a4a8d2ce7eb1d893d8c3182cc83d"
SRC_URI[sha256sum] = "6cc4fdd9122e2b5f73245f423054a050ecf3a38ad4cd13abf112c7cbf6130b6c"

RDEPENDS_${PN} += "python3 python3-modules python3-pip"

FILES_${PN} += "${datadir}/etc/*"
