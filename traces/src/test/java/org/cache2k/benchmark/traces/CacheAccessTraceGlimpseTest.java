package org.cache2k.benchmark.traces;

/*
 * #%L
 * Benchmarks: Access trace collection
 * %%
 * Copyright (C) 2013 - 2017 headissue GmbH, Munich
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the 
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public 
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

import org.cache2k.benchmark.util.AccessTrace;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Jens Wilke; created: 2013-11-21
 */
public class CacheAccessTraceGlimpseTest {

  @Test
  public void test() {
    AccessTrace t = CacheAccessTraceGlimpse.getInstance();
    assertEquals(6015, t.getTraceLength());
    assertEquals(2529, t.getValueCount());
    assertEquals(461, t.getOptHitCount(100));
  }

}
