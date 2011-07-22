/**
 * Copyright (c) 2002-2011 "Neo Technology,"
 * Network Engine for Objects in Lund AB [http://neotechnology.com]
 *
 * This file is part of Neo4j.
 *
 * Neo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.neo4j.collections.graphdb;

import org.neo4j.graphdb.RelationshipType;

public interface GraphDatabaseService extends org.neo4j.graphdb.GraphDatabaseService{

	public Node createNodeExt();

	public Iterable<Node> getAllNodesExt();

	public Node getNodeByIdExt(long arg0);

	public Node getReferenceNodeExt();

	public Relationship getRelationshipByIdExt(long arg0);

	public Iterable<EnhancedRelationshipType> getRelationshipTypesExt();

	public PropertyType<Boolean> getBooleanPropertyType(String name);
	
	public PropertyType<Boolean[]> getBooleanArrayPropertyType(String name);

	public ComparablePropertyType<Byte> getBytePropertyType(String name);
	
	public PropertyType<Byte[]> getByteArrayPropertyType(String name);
	
	public ComparablePropertyType<Double> getDoublePropertyType(String name);
	
	public PropertyType<Double[]> getDoubleArrayPropertyType(String name);

	public ComparablePropertyType<Float> getFloatPropertyType(String name);
	
	public PropertyType<Float[]> getFloatArrayPropertyType(String name);

	public ComparablePropertyType<Long> getLongPropertyType(String name);
	
	public PropertyType<Long[]> getLongArrayPropertyType(String name);

	public ComparablePropertyType<Short> getShortPropertyType(String name);
	
	public PropertyType<Short[]> getShortArrayPropertyType(String name);

	public ComparablePropertyType<String> getStringPropertyType(String name);
	
	public PropertyType<String[]> getStringArrayPropertyType(String name);

	public EnhancedRelationshipType getRelationshipType(String name);
		
	public RelationshipType getRelationshipType(RelationshipType relType);
}
