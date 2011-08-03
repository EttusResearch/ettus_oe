DESCRIPTION = "Base software to install GNU Radio"

PR = "r4"

inherit task

RDEPENDS_${PN} = "\
  gnuradio \
#  gnuradio-dev \
  gnuradio-examples \
"
