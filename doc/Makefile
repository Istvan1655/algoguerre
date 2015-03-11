PROJECT=rapport
BIBLIOGRAPHY=rapport
TEX=pdflatex
BIBTEX=bibtex
BUILDTEX=$(TEX) $(PROJECT).tex

all:
	$(BUILDTEX)
	$(BIBTEX) $(BIBLIOGRAPHY)
	$(BUILDTEX)
	$(BUILDTEX)

	rm -f *.log *.bak *.aux *.bbl *.blg *.idx *.toc *.out *~
    
clean-all:
	rm -f *.dvi *.log *.bak *.aux *.bbl *.blg *.idx *.ps *.eps *.pdf *.toc *.out *~

clean:
	rm -f *.log *.bak *.aux *.bbl *.blg *.idx *.toc *.out *~
