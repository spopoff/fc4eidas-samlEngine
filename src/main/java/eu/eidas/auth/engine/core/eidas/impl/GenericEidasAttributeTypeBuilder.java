/* 
 * Licensed under the EUPL, Version 1.1 or – as soon they will be approved by
 * the European Commission - subsequent versions of the EUPL (the "Licence");
 * You may not use this work except in compliance with the Licence. You may
 * obtain a copy of the Licence at:
 * 
 * http://www.osor.eu/eupl/european-union-public-licence-eupl-v.1.1
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the Licence is distributed on an "AS IS" basis, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * Licence for the specific language governing permissions and limitations under
 * the Licence.
 */

package eu.eidas.auth.engine.core.eidas.impl;

import eu.eidas.auth.engine.core.eidas.GenericEidasAttributeType;

import org.opensaml.common.impl.AbstractSAMLObjectBuilder;

import javax.xml.namespace.QName;

/**
 * The Class GenericEidasAttributeTypeBuilder.
 */
public class GenericEidasAttributeTypeBuilder extends AbstractSAMLObjectBuilder<GenericEidasAttributeType> {

    /**
     * Builds the object SigningMethod.
     *
     * @return the SigningMethod.
     */
    public final GenericEidasAttributeType buildObject() {
    	return buildObject(new QName("",""));
    }

    /**
     * Builds the object SigningMethod.
     *
     * @param namespaceURI the namespace uri
     * @param localName the local name
     * @param namespacePrefix the namespace prefix
     * @return the SigningMethod
     */
    public final GenericEidasAttributeType buildObject(final String namespaceURI,
	    final String localName, final String namespacePrefix) {
    	return new GenericEidasAttributeTypeImpl(namespaceURI, localName, namespacePrefix);
    }
}