# set up lexica directories
mkdir resources/lexiconWsjSTMP resources/lexiconWsjSTM resources/lexiconWsjSTP resources/lexiconWsjST
# run each trainer and related tests
java -Xmx8g -cp "resources:lib/hppc-0.3.1.jar:lib/liblinear-1.51.jar:../POS tagger/resources:lib/args4j-2.0.12.jar:bin:$UIMA_HOME/lib/uima-core.jar:$UIMA_HOME/lib/uima-cpe.jar:$UIMA_HOME/lib/uima-tools.jar:$UIMA_HOME/lib/uima-document-annotations.jar:../chunker/bin:../clinical documents pipeline/bin:../context dependent tokenizer/bin:../core/bin:../dictionary lookup/bin:../document preprocessor/bin:../LVG/bin:../NE contexts/bin:../POS tagger/bin:../core/lib/log4j-1.2.8.jar:../core/lib/jdom.jar:../core/lib/lucene-core-3.0.2.jar:../core/lib/opennlp-tools-1.4.3.jar:../core/lib/maxent-2.5.0.jar:../core/lib/OpenAI_FSM.jar:../core/lib/trove.jar:../LVG/lib/lvg2008dist.jar:../document preprocessor/lib/xercesImpl.jar:../document preprocessor/lib/xml-apis.jar:../document preprocessor/lib/xmlParserAPIs.jar:../chunker/resources:../clinical documents pipeline/resources:../context dependent tokenizer/resources:../core/resources:../dictionary lookup/resources:../document preprocessor/resources:../LVG/resources:../NE contexts/resources:../POS tagger/resources" edu.mayo.bmi.uima.core.test.CpeTests desc/test/WgcTrainST.xml
rm -f resources/wgc-ST.mod.ftr
java -Xmx1g  -cp "resources:lib/hppc-0.3.1.jar:lib/liblinear-1.51.jar:../POS tagger/resources:lib/args4j-2.0.12.jar:bin:$UIMA_HOME/lib/uima-core.jar:$UIMA_HOME/lib/uima-cpe.jar:$UIMA_HOME/lib/uima-tools.jar:$UIMA_HOME/lib/uima-document-annotations.jar:../chunker/bin:../clinical documents pipeline/bin:../context dependent tokenizer/bin:../core/bin:../dictionary lookup/bin:../document preprocessor/bin:../LVG/bin:../NE contexts/bin:../POS tagger/bin:../core/lib/log4j-1.2.8.jar:../core/lib/jdom.jar:../core/lib/lucene-core-3.0.2.jar:../core/lib/opennlp-tools-1.4.3.jar:../core/lib/maxent-2.5.0.jar:../core/lib/OpenAI_FSM.jar:../core/lib/trove.jar:../LVG/lib/lvg2008dist.jar:../document preprocessor/lib/xercesImpl.jar:../document preprocessor/lib/xml-apis.jar:../document preprocessor/lib/xmlParserAPIs.jar:../chunker/resources:../clinical documents pipeline/resources:../context dependent tokenizer/resources:../core/resources:../dictionary lookup/resources:../document preprocessor/resources:../LVG/resources:../NE contexts/resources:../POS tagger/resources" edu.mayo.bmi.uima.core.test.CpeTests desc/test/WgcTestSTTrainST.xml
data/eval.py data/clinques-test.dep data/outputWgcSTST/doc0.dep > clinques-test-wgc-train-results.txt

java -Xmx8g  -cp "resources:lib/hppc-0.3.1.jar:lib/liblinear-1.51.jar:../POS tagger/resources:lib/args4j-2.0.12.jar:bin:$UIMA_HOME/lib/uima-core.jar:$UIMA_HOME/lib/uima-cpe.jar:$UIMA_HOME/lib/uima-tools.jar:$UIMA_HOME/lib/uima-document-annotations.jar:../chunker/bin:../clinical documents pipeline/bin:../context dependent tokenizer/bin:../core/bin:../dictionary lookup/bin:../document preprocessor/bin:../LVG/bin:../NE contexts/bin:../POS tagger/bin:../core/lib/log4j-1.2.8.jar:../core/lib/jdom.jar:../core/lib/lucene-core-3.0.2.jar:../core/lib/opennlp-tools-1.4.3.jar:../core/lib/maxent-2.5.0.jar:../core/lib/OpenAI_FSM.jar:../core/lib/trove.jar:../LVG/lib/lvg2008dist.jar:../document preprocessor/lib/xercesImpl.jar:../document preprocessor/lib/xml-apis.jar:../document preprocessor/lib/xmlParserAPIs.jar:../chunker/resources:../clinical documents pipeline/resources:../context dependent tokenizer/resources:../core/resources:../dictionary lookup/resources:../document preprocessor/resources:../LVG/resources:../NE contexts/resources:../POS tagger/resources" edu.mayo.bmi.uima.core.test.CpeTests desc/test/WgcTrainSTMP.xml
rm -f resources/wgc-STMP.mod.ftr
mkdir data/outputWgcSTMPSTMP
java -cp bin:lib/hppc-0.3.1.jar:resources clear.engine.DepPredict -t data/clinques-test.dep -o data/outputWgcSTMPSTMP/doc0.dep -c resources/config_en_wgc-STMP.xml
data/eval.py data/clinques-test.dep data/outputWgcSTMPSTMP/doc0.dep > clinques-test-wgc-train-results.txt
java -Xmx1g  -cp "resources:lib/hppc-0.3.1.jar:lib/liblinear-1.51.jar:../POS tagger/resources:lib/args4j-2.0.12.jar:bin:$UIMA_HOME/lib/uima-core.jar:$UIMA_HOME/lib/uima-cpe.jar:$UIMA_HOME/lib/uima-tools.jar:$UIMA_HOME/lib/uima-document-annotations.jar:../chunker/bin:../clinical documents pipeline/bin:../context dependent tokenizer/bin:../core/bin:../dictionary lookup/bin:../document preprocessor/bin:../LVG/bin:../NE contexts/bin:../POS tagger/bin:../core/lib/log4j-1.2.8.jar:../core/lib/jdom.jar:../core/lib/lucene-core-3.0.2.jar:../core/lib/opennlp-tools-1.4.3.jar:../core/lib/maxent-2.5.0.jar:../core/lib/OpenAI_FSM.jar:../core/lib/trove.jar:../LVG/lib/lvg2008dist.jar:../document preprocessor/lib/xercesImpl.jar:../document preprocessor/lib/xml-apis.jar:../document preprocessor/lib/xmlParserAPIs.jar:../chunker/resources:../clinical documents pipeline/resources:../context dependent tokenizer/resources:../core/resources:../dictionary lookup/resources:../document preprocessor/resources:../LVG/resources:../NE contexts/resources:../POS tagger/resources" edu.mayo.bmi.uima.core.test.CpeTests desc/test/WgcTestSTMTrainSTMP.xml
data/eval.py data/clinques-test.dep data/outputWgcSTMPSTM/doc0.dep >> clinques-test-wgc-train-results.txt
java -Xmx1g  -cp "resources:lib/hppc-0.3.1.jar:lib/liblinear-1.51.jar:../POS tagger/resources:lib/args4j-2.0.12.jar:bin:$UIMA_HOME/lib/uima-core.jar:$UIMA_HOME/lib/uima-cpe.jar:$UIMA_HOME/lib/uima-tools.jar:$UIMA_HOME/lib/uima-document-annotations.jar:../chunker/bin:../clinical documents pipeline/bin:../context dependent tokenizer/bin:../core/bin:../dictionary lookup/bin:../document preprocessor/bin:../LVG/bin:../NE contexts/bin:../POS tagger/bin:../core/lib/log4j-1.2.8.jar:../core/lib/jdom.jar:../core/lib/lucene-core-3.0.2.jar:../core/lib/opennlp-tools-1.4.3.jar:../core/lib/maxent-2.5.0.jar:../core/lib/OpenAI_FSM.jar:../core/lib/trove.jar:../LVG/lib/lvg2008dist.jar:../document preprocessor/lib/xercesImpl.jar:../document preprocessor/lib/xml-apis.jar:../document preprocessor/lib/xmlParserAPIs.jar:../chunker/resources:../clinical documents pipeline/resources:../context dependent tokenizer/resources:../core/resources:../dictionary lookup/resources:../document preprocessor/resources:../LVG/resources:../NE contexts/resources:../POS tagger/resources" edu.mayo.bmi.uima.core.test.CpeTests desc/test/WgcTestSTPTrainSTMP.xml
data/eval.py data/clinques-test.dep data/outputWgcSTMPSTP/doc0.dep >> clinques-test-wgc-train-results.txt
java -Xmx1g  -cp "resources:lib/hppc-0.3.1.jar:lib/liblinear-1.51.jar:../POS tagger/resources:lib/args4j-2.0.12.jar:bin:$UIMA_HOME/lib/uima-core.jar:$UIMA_HOME/lib/uima-cpe.jar:$UIMA_HOME/lib/uima-tools.jar:$UIMA_HOME/lib/uima-document-annotations.jar:../chunker/bin:../clinical documents pipeline/bin:../context dependent tokenizer/bin:../core/bin:../dictionary lookup/bin:../document preprocessor/bin:../LVG/bin:../NE contexts/bin:../POS tagger/bin:../core/lib/log4j-1.2.8.jar:../core/lib/jdom.jar:../core/lib/lucene-core-3.0.2.jar:../core/lib/opennlp-tools-1.4.3.jar:../core/lib/maxent-2.5.0.jar:../core/lib/OpenAI_FSM.jar:../core/lib/trove.jar:../LVG/lib/lvg2008dist.jar:../document preprocessor/lib/xercesImpl.jar:../document preprocessor/lib/xml-apis.jar:../document preprocessor/lib/xmlParserAPIs.jar:../chunker/resources:../clinical documents pipeline/resources:../context dependent tokenizer/resources:../core/resources:../dictionary lookup/resources:../document preprocessor/resources:../LVG/resources:../NE contexts/resources:../POS tagger/resources" edu.mayo.bmi.uima.core.test.CpeTests desc/test/WgcTestSTTrainSTMP.xml
data/eval.py data/clinques-test.dep data/outputWgcSTMPST/doc0.dep >> clinques-test-wgc-train-results.txt

java -Xmx8g  -cp "resources:lib/hppc-0.3.1.jar:lib/liblinear-1.51.jar:../POS tagger/resources:lib/args4j-2.0.12.jar:bin:$UIMA_HOME/lib/uima-core.jar:$UIMA_HOME/lib/uima-cpe.jar:$UIMA_HOME/lib/uima-tools.jar:$UIMA_HOME/lib/uima-document-annotations.jar:../chunker/bin:../clinical documents pipeline/bin:../context dependent tokenizer/bin:../core/bin:../dictionary lookup/bin:../document preprocessor/bin:../LVG/bin:../NE contexts/bin:../POS tagger/bin:../core/lib/log4j-1.2.8.jar:../core/lib/jdom.jar:../core/lib/lucene-core-3.0.2.jar:../core/lib/opennlp-tools-1.4.3.jar:../core/lib/maxent-2.5.0.jar:../core/lib/OpenAI_FSM.jar:../core/lib/trove.jar:../LVG/lib/lvg2008dist.jar:../document preprocessor/lib/xercesImpl.jar:../document preprocessor/lib/xml-apis.jar:../document preprocessor/lib/xmlParserAPIs.jar:../chunker/resources:../clinical documents pipeline/resources:../context dependent tokenizer/resources:../core/resources:../dictionary lookup/resources:../document preprocessor/resources:../LVG/resources:../NE contexts/resources:../POS tagger/resources" edu.mayo.bmi.uima.core.test.CpeTests desc/test/WgcTrainSTM.xml
rm -f resources/wgc-STM.mod.ftr
java -Xmx1g  -cp "resources:lib/hppc-0.3.1.jar:lib/liblinear-1.51.jar:../POS tagger/resources:lib/args4j-2.0.12.jar:bin:$UIMA_HOME/lib/uima-core.jar:$UIMA_HOME/lib/uima-cpe.jar:$UIMA_HOME/lib/uima-tools.jar:$UIMA_HOME/lib/uima-document-annotations.jar:../chunker/bin:../clinical documents pipeline/bin:../context dependent tokenizer/bin:../core/bin:../dictionary lookup/bin:../document preprocessor/bin:../LVG/bin:../NE contexts/bin:../POS tagger/bin:../core/lib/log4j-1.2.8.jar:../core/lib/jdom.jar:../core/lib/lucene-core-3.0.2.jar:../core/lib/opennlp-tools-1.4.3.jar:../core/lib/maxent-2.5.0.jar:../core/lib/OpenAI_FSM.jar:../core/lib/trove.jar:../LVG/lib/lvg2008dist.jar:../document preprocessor/lib/xercesImpl.jar:../document preprocessor/lib/xml-apis.jar:../document preprocessor/lib/xmlParserAPIs.jar:../chunker/resources:../clinical documents pipeline/resources:../context dependent tokenizer/resources:../core/resources:../dictionary lookup/resources:../document preprocessor/resources:../LVG/resources:../NE contexts/resources:../POS tagger/resources" edu.mayo.bmi.uima.core.test.CpeTests desc/test/WgcTestSTMTrainSTM.xml
data/eval.py data/clinques-test.dep data/outputWgcSTMSTM/doc0.dep >> clinques-test-wgc-train-results.txt

java -Xmx8g  -cp "resources:lib/hppc-0.3.1.jar:lib/liblinear-1.51.jar:../POS tagger/resources:lib/args4j-2.0.12.jar:bin:$UIMA_HOME/lib/uima-core.jar:$UIMA_HOME/lib/uima-cpe.jar:$UIMA_HOME/lib/uima-tools.jar:$UIMA_HOME/lib/uima-document-annotations.jar:../chunker/bin:../clinical documents pipeline/bin:../context dependent tokenizer/bin:../core/bin:../dictionary lookup/bin:../document preprocessor/bin:../LVG/bin:../NE contexts/bin:../POS tagger/bin:../core/lib/log4j-1.2.8.jar:../core/lib/jdom.jar:../core/lib/lucene-core-3.0.2.jar:../core/lib/opennlp-tools-1.4.3.jar:../core/lib/maxent-2.5.0.jar:../core/lib/OpenAI_FSM.jar:../core/lib/trove.jar:../LVG/lib/lvg2008dist.jar:../document preprocessor/lib/xercesImpl.jar:../document preprocessor/lib/xml-apis.jar:../document preprocessor/lib/xmlParserAPIs.jar:../chunker/resources:../clinical documents pipeline/resources:../context dependent tokenizer/resources:../core/resources:../dictionary lookup/resources:../document preprocessor/resources:../LVG/resources:../NE contexts/resources:../POS tagger/resources" edu.mayo.bmi.uima.core.test.CpeTests desc/test/WgcTrainSTP.xml
rm -f resources/wgc-STP.mod.ftr
java -Xmx1g  -cp "resources:lib/hppc-0.3.1.jar:lib/liblinear-1.51.jar:../POS tagger/resources:lib/args4j-2.0.12.jar:bin:$UIMA_HOME/lib/uima-core.jar:$UIMA_HOME/lib/uima-cpe.jar:$UIMA_HOME/lib/uima-tools.jar:$UIMA_HOME/lib/uima-document-annotations.jar:../chunker/bin:../clinical documents pipeline/bin:../context dependent tokenizer/bin:../core/bin:../dictionary lookup/bin:../document preprocessor/bin:../LVG/bin:../NE contexts/bin:../POS tagger/bin:../core/lib/log4j-1.2.8.jar:../core/lib/jdom.jar:../core/lib/lucene-core-3.0.2.jar:../core/lib/opennlp-tools-1.4.3.jar:../core/lib/maxent-2.5.0.jar:../core/lib/OpenAI_FSM.jar:../core/lib/trove.jar:../LVG/lib/lvg2008dist.jar:../document preprocessor/lib/xercesImpl.jar:../document preprocessor/lib/xml-apis.jar:../document preprocessor/lib/xmlParserAPIs.jar:../chunker/resources:../clinical documents pipeline/resources:../context dependent tokenizer/resources:../core/resources:../dictionary lookup/resources:../document preprocessor/resources:../LVG/resources:../NE contexts/resources:../POS tagger/resources" edu.mayo.bmi.uima.core.test.CpeTests desc/test/WgcTestSTPTrainSTP.xml
data/eval.py data/clinques-test.dep data/outputWgcSTPSTP/doc0.dep >> clinques-test-wgc-train-results.txt

# run the tests!

# grab results
#data/eval.py data/clinques-test.dep data/outputWgcSTST/doc0.dep > clinques-test-wgc-train-results.txt
#data/eval.py data/clinques-test.dep data/outputWgcSTMPSTMP/doc0.dep > clinques-test-wgc-train-results.txt
#data/eval.py data/clinques-test.dep data/outputWgcSTMPSTM/doc0.dep >> clinques-test-wgc-train-results.txt
#data/eval.py data/clinques-test.dep data/outputWgcSTMPSTP/doc0.dep >> clinques-test-wgc-train-results.txt
#data/eval.py data/clinques-test.dep data/outputWgcSTMPST/doc0.dep >> clinques-test-wgc-train-results.txt
#data/eval.py data/clinques-test.dep data/outputWgcSTMSTM/doc0.dep >> clinques-test-wgc-train-results.txt
#data/eval.py data/clinques-test.dep data/outputWgcSTPSTP/doc0.dep >> clinques-test-wgc-train-results.txt
