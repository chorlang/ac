/*
 * Copyright (C) 2015 by Fabrizio Montesi <famontesi@gmail.com>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.

 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.

 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301
 * USA
 */

package chor.parser;

import chor.parser.ast.ChorNode;
import chor.parser.ast.ValueCommunication;
import org.codehaus.jparsec.Parser;
import org.codehaus.jparsec.Parsers;
import org.codehaus.jparsec.Scanners;
import org.codehaus.jparsec.Terminals;
import org.codehaus.jparsec.misc.Mapper;

public final class ChorParser
{
	private static final Parser< Void > IGNORED =
		Parsers.or( Scanners.JAVA_LINE_COMMENT, Scanners.JAVA_BLOCK_COMMENT, Scanners.WHITESPACES ).skipMany();
	
	private static final Parser< String > ID = Scanners.IDENTIFIER.between( IGNORED, IGNORED );
	private static final Parser< ? > ARROW = Terminals.operators( "->" ).tokenizer();
	
	private ChorParser() {}
	
	public static Parser< ? extends ChorNode > create()
	{
		return valueCommunication();
	}
	
	private static Parser< ValueCommunication > valueCommunication()
	{
		return Mapper.curry( ValueCommunication.class ).sequence( ID, ARROW.next( ID ) );
	}
}
