DESCRIPTION = "Open-source home automation platform running on Python 3."
HOMEPAGE = "https://home-assistant.io/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2aaba14ff23856010e6b6000a4e45fd6"
SRCNAME = "home-assistant"

S = "${WORKDIR}/${SRCNAME}-${PV}"

SRC_URI = "https://github.com/home-assistant/home-assistant/archive/${PV}.zip \
    file://hass-daemon \
    file://00_avoid_using_local_environmnet.patch"


inherit setuptools3 update-rc.d
# systemd ?

### Installation dependencies
## "libgcc_s.so.1 must be installed for pthread_cancel to work"
RDEPENDS_${PN} += "libstdc++"

## Python packages provided in meta-oe
RDEPENDS_${PN} += "python3 python3-modules python3-pip python3-jinja2 python3-requests"

## An inner dependency, python package provided inside the python manifest
RDEPENDS_${PN} += "python3-sqlite3"

## Python packages provided in meta-widde ported to python3 from meta-oe
RDEPENDS_${PN} += "python3-pyyaml python3-pytz"

## Recipes created specially
RDEPENDS_${PN} += "python3-typing python3-voluptuous python3-aiohttp python3-async-timeout"

## Dependecies found in external layers but somehow satisfied during the process
# MarkupSafe: http://git.yoctoproject.org/cgit/cgit.cgi/meta-cloud-services/tree/meta-openstack/recipes-devtools/python/python-markupsafe_0.18.bb or http://git.yoctoproject.org/cgit/cgit.cgi/meta-maker/tree/recipes-python/markupsafe/python-markupsafe_git.bb?h=dizzy


### Execution dependencies
## netdisco requires netifaces which tries to compile, but fails to install in target HA own repo
# http://git.yoctoproject.org/cgit/cgit.cgi/meta-maker/tree/recipes-python/netifaces?h=fido
RDEPENDS_${PN} += "python3-netifaces"

# systemd
SYSTEMD_SERVICE_${PN} = "home-assistant@.service"

# sysv init
INITSCRIPT_NAME = "hass-daemon"
INITSCRIPT_PARAMS = "defaults 92"

SRC_URI[md5sum] = "15f6c7b755bded8f8700b1b71310a452"
SRC_URI[sha256sum] = "20b3e884b65738afac42f70b4cb5469ebd6dce869fc468ee53dbb4f5542cc0ef"

do_install_append () {
    install -d ${D}${INIT_D_DIR}
    install -m 0755 ../${INITSCRIPT_NAME} ${D}${INIT_D_DIR}/

    # Ensure the creation of the CONFIG_DIR used in the hass-daemon script
    # TODO: Configure this
    install -d ${D}${localstatedir}/opt/homeassistant

    # TODO: Edit hass-daemon script to set the USER variable within this recipe(defaulted to root)

}

