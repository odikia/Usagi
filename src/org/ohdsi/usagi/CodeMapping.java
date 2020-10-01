/*******************************************************************************
 * Copyright 2019 Observational Health Data Sciences and Informatics
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.ohdsi.usagi;

import java.util.ArrayList;
import java.util.List;

/**
 * Data class for holding information on a single source code and its mapping
 *
 * @author MSCHUEMI
 */
public class CodeMapping {
    public enum MappingStatus {
        APPROVED, UNCHECKED, AUTO_MAPPED, AUTO_MAPPED_TO_1, INVALID_TARGET, IGNORED
    };

    public SourceCode sourceCode;
    public double matchScore;
    public MappingStatus mappingStatus;
    public List<MappingTarget> targetConcepts = new ArrayList<>(1);
    public String comment;

    public CodeMapping(SourceCode sourceCode) {
        this.sourceCode = sourceCode;
    }

}
