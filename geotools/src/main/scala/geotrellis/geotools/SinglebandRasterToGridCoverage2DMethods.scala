package geotrellis.geotools

import geotrellis.raster._
import geotrellis.util._

import org.geotools.coverage.grid.GridCoverage2D

trait SinglebandRasterToGridCoverage2DMethods extends MethodExtensions[Raster[Tile]] {
  def toGridCoverage2D(): GridCoverage2D =
    GridCoverage2DConverters.convertToGridCoverage2D(self)
}

trait SinglebandProjectedRasterToGridCoverage2DMethods[T <: Tile] extends MethodExtensions[ProjectedRaster[T]] {
  def toGridCoverage2D(): GridCoverage2D =
    GridCoverage2DConverters.convertToGridCoverage2D(self.raster, self.crs)
}
