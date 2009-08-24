# requires Beamer latex package:
# on OS X: http://arthurkoziel.com/2008/06/02/how-to-install-latex-beamer-for-tex-live-on-mac-os-x/
# on Linux: http://www.math-linux.com/spip.php?article77

all: pdf

dot:
	dot -Tpdf -O graphics/*_dot

pdf: dot
	pdflatex presentation.tex && open presentation.pdf

clean:
	rm -rf *.aux *.log *.nav *.vrb *.out *.pdf *.snm *.toc graphics/*.pdf
