/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.proofpoint.http.server;

import java.util.DoubleSummaryStatistics;

import static java.util.Objects.requireNonNull;

public class DoubleSummaryStats
{
    private final DoubleSummaryStatistics stats;

    public DoubleSummaryStats(DoubleSummaryStatistics stats)
    {
        this.stats = requireNonNull(stats, "stats is null");
    }

    public double getMin()
    {
        return stats.getMin();
    }

    public double getMax()
    {
        return stats.getMax();
    }

    public double getAverage()
    {
        return stats.getAverage();
    }

    public long getCount()
    {
        return stats.getCount();
    }
}
