SUMMARY = "Poky-tiny init"
DESCRIPTION = "Basic init system for poky-tiny"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

PR = "r2"

RDEPENDS_${PN} = "busybox"

SRC_URI = "file://init \
	   file://rc.local.sample \
	  "

do_configure() {
	:
}

do_compile() {
	:
}

do_install() {
	install -d ${D}${sysconfdir}
	install -m 0755 ${WORKDIR}/init ${D}
	install -m 0755 ${WORKDIR}/rc.local.sample ${D}${sysconfdir}
}

FILES_${PN} = "/init ${sysconfdir}/rc.local.sample"
