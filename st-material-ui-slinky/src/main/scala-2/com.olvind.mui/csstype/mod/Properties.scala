package com.olvind.mui.csstype.mod

import com.olvind.mui.csstype.mod.Property.AlignmentBaseline
import com.olvind.mui.csstype.mod.Property.BaselineShift
import com.olvind.mui.csstype.mod.Property.ClipRule
import com.olvind.mui.csstype.mod.Property.ColorInterpolation
import com.olvind.mui.csstype.mod.Property.ColorRendering
import com.olvind.mui.csstype.mod.Property.DominantBaseline
import com.olvind.mui.csstype.mod.Property.Fill
import com.olvind.mui.csstype.mod.Property.FillOpacity
import com.olvind.mui.csstype.mod.Property.FillRule
import com.olvind.mui.csstype.mod.Property.FloodColor
import com.olvind.mui.csstype.mod.Property.FloodOpacity
import com.olvind.mui.csstype.mod.Property.GlyphOrientationVertical
import com.olvind.mui.csstype.mod.Property.LightingColor
import com.olvind.mui.csstype.mod.Property.Marker
import com.olvind.mui.csstype.mod.Property.MarkerEnd
import com.olvind.mui.csstype.mod.Property.MarkerMid
import com.olvind.mui.csstype.mod.Property.MarkerStart
import com.olvind.mui.csstype.mod.Property.ShapeRendering
import com.olvind.mui.csstype.mod.Property.StopColor
import com.olvind.mui.csstype.mod.Property.StopOpacity
import com.olvind.mui.csstype.mod.Property.Stroke
import com.olvind.mui.csstype.mod.Property.StrokeDasharray
import com.olvind.mui.csstype.mod.Property.StrokeDashoffset
import com.olvind.mui.csstype.mod.Property.StrokeLinecap
import com.olvind.mui.csstype.mod.Property.StrokeLinejoin
import com.olvind.mui.csstype.mod.Property.StrokeMiterlimit
import com.olvind.mui.csstype.mod.Property.StrokeOpacity
import com.olvind.mui.csstype.mod.Property.StrokeWidth
import com.olvind.mui.csstype.mod.Property.TextAnchor
import com.olvind.mui.csstype.mod.Property.VectorEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- `com.olvind.mui`.csstype.mod.SvgProperties because var conflicts: clip, clipPath, color, cursor, direction, display, filter, font, fontFamily, fontSize, fontSizeAdjust, fontStretch, fontStyle, fontVariant, fontWeight, imageRendering, letterSpacing, lineHeight, mask, opacity, overflow, paintOrder, pointerEvents, textDecoration, textRendering, unicodeBidi, visibility, whiteSpace, wordSpacing, writingMode. Inlined alignmentBaseline, baselineShift, clipRule, colorInterpolation, colorRendering, dominantBaseline, fill, fillOpacity, fillRule, floodColor, floodOpacity, glyphOrientationVertical, lightingColor, marker, markerEnd, markerMid, markerStart, shapeRendering, stopColor, stopOpacity, stroke, strokeDasharray, strokeDashoffset, strokeLinecap, strokeLinejoin, strokeMiterlimit, strokeOpacity, strokeWidth, textAnchor, vectorEffect */ @js.native
trait Properties[TLength, TTime]
  extends StObject
     with StandardProperties[TLength, TTime]
     with VendorProperties[TLength, TTime]
     with ObsoleteProperties[TLength, TTime] {
  
  var alignmentBaseline: js.UndefOr[AlignmentBaseline] = js.native
  
  var baselineShift: js.UndefOr[BaselineShift[TLength]] = js.native
  
  var clipRule: js.UndefOr[ClipRule] = js.native
  
  var colorInterpolation: js.UndefOr[ColorInterpolation] = js.native
  
  var colorRendering: js.UndefOr[ColorRendering] = js.native
  
  var dominantBaseline: js.UndefOr[DominantBaseline] = js.native
  
  var fill: js.UndefOr[Fill] = js.native
  
  var fillOpacity: js.UndefOr[FillOpacity] = js.native
  
  var fillRule: js.UndefOr[FillRule] = js.native
  
  var floodColor: js.UndefOr[FloodColor] = js.native
  
  var floodOpacity: js.UndefOr[FloodOpacity] = js.native
  
  var glyphOrientationVertical: js.UndefOr[GlyphOrientationVertical] = js.native
  
  var lightingColor: js.UndefOr[LightingColor] = js.native
  
  var marker: js.UndefOr[Marker] = js.native
  
  var markerEnd: js.UndefOr[MarkerEnd] = js.native
  
  var markerMid: js.UndefOr[MarkerMid] = js.native
  
  var markerStart: js.UndefOr[MarkerStart] = js.native
  
  var shapeRendering: js.UndefOr[ShapeRendering] = js.native
  
  var stopColor: js.UndefOr[StopColor] = js.native
  
  var stopOpacity: js.UndefOr[StopOpacity] = js.native
  
  var stroke: js.UndefOr[Stroke] = js.native
  
  var strokeDasharray: js.UndefOr[StrokeDasharray[TLength]] = js.native
  
  var strokeDashoffset: js.UndefOr[StrokeDashoffset[TLength]] = js.native
  
  var strokeLinecap: js.UndefOr[StrokeLinecap] = js.native
  
  var strokeLinejoin: js.UndefOr[StrokeLinejoin] = js.native
  
  var strokeMiterlimit: js.UndefOr[StrokeMiterlimit] = js.native
  
  var strokeOpacity: js.UndefOr[StrokeOpacity] = js.native
  
  var strokeWidth: js.UndefOr[StrokeWidth[TLength]] = js.native
  
  var textAnchor: js.UndefOr[TextAnchor] = js.native
  
  var vectorEffect: js.UndefOr[VectorEffect] = js.native
}
object Properties {
  
  @scala.inline
  def apply[TLength, TTime](): Properties[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Properties[TLength, TTime]]
  }
  
  @scala.inline
  implicit class PropertiesMutableBuilder[Self <: Properties[_, _], TLength, TTime] (val x: Self with (Properties[TLength, TTime])) extends AnyVal {
    
    @scala.inline
    def setAlignmentBaseline(value: AlignmentBaseline): Self = StObject.set(x, "alignmentBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignmentBaselineUndefined: Self = StObject.set(x, "alignmentBaseline", js.undefined)
    
    @scala.inline
    def setBaselineShift(value: BaselineShift[TLength]): Self = StObject.set(x, "baselineShift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaselineShiftUndefined: Self = StObject.set(x, "baselineShift", js.undefined)
    
    @scala.inline
    def setClipRule(value: ClipRule): Self = StObject.set(x, "clipRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipRuleUndefined: Self = StObject.set(x, "clipRule", js.undefined)
    
    @scala.inline
    def setColorInterpolation(value: ColorInterpolation): Self = StObject.set(x, "colorInterpolation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorInterpolationUndefined: Self = StObject.set(x, "colorInterpolation", js.undefined)
    
    @scala.inline
    def setColorRendering(value: ColorRendering): Self = StObject.set(x, "colorRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorRenderingUndefined: Self = StObject.set(x, "colorRendering", js.undefined)
    
    @scala.inline
    def setDominantBaseline(value: DominantBaseline): Self = StObject.set(x, "dominantBaseline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDominantBaselineUndefined: Self = StObject.set(x, "dominantBaseline", js.undefined)
    
    @scala.inline
    def setFill(value: Fill): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacity(value: FillOpacity): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    @scala.inline
    def setFillRule(value: FillRule): Self = StObject.set(x, "fillRule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillRuleUndefined: Self = StObject.set(x, "fillRule", js.undefined)
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setFloodColor(value: FloodColor): Self = StObject.set(x, "floodColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodColorUndefined: Self = StObject.set(x, "floodColor", js.undefined)
    
    @scala.inline
    def setFloodOpacity(value: FloodOpacity): Self = StObject.set(x, "floodOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloodOpacityUndefined: Self = StObject.set(x, "floodOpacity", js.undefined)
    
    @scala.inline
    def setGlyphOrientationVertical(value: GlyphOrientationVertical): Self = StObject.set(x, "glyphOrientationVertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyphOrientationVerticalUndefined: Self = StObject.set(x, "glyphOrientationVertical", js.undefined)
    
    @scala.inline
    def setLightingColor(value: LightingColor): Self = StObject.set(x, "lightingColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLightingColorUndefined: Self = StObject.set(x, "lightingColor", js.undefined)
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerEnd(value: MarkerEnd): Self = StObject.set(x, "markerEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerEndUndefined: Self = StObject.set(x, "markerEnd", js.undefined)
    
    @scala.inline
    def setMarkerMid(value: MarkerMid): Self = StObject.set(x, "markerMid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerMidUndefined: Self = StObject.set(x, "markerMid", js.undefined)
    
    @scala.inline
    def setMarkerStart(value: MarkerStart): Self = StObject.set(x, "markerStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerStartUndefined: Self = StObject.set(x, "markerStart", js.undefined)
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    @scala.inline
    def setShapeRendering(value: ShapeRendering): Self = StObject.set(x, "shapeRendering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShapeRenderingUndefined: Self = StObject.set(x, "shapeRendering", js.undefined)
    
    @scala.inline
    def setStopColor(value: StopColor): Self = StObject.set(x, "stopColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopColorUndefined: Self = StObject.set(x, "stopColor", js.undefined)
    
    @scala.inline
    def setStopOpacity(value: StopOpacity): Self = StObject.set(x, "stopOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopOpacityUndefined: Self = StObject.set(x, "stopOpacity", js.undefined)
    
    @scala.inline
    def setStroke(value: Stroke): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDasharray(value: StrokeDasharray[TLength]): Self = StObject.set(x, "strokeDasharray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDasharrayUndefined: Self = StObject.set(x, "strokeDasharray", js.undefined)
    
    @scala.inline
    def setStrokeDashoffset(value: StrokeDashoffset[TLength]): Self = StObject.set(x, "strokeDashoffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeDashoffsetUndefined: Self = StObject.set(x, "strokeDashoffset", js.undefined)
    
    @scala.inline
    def setStrokeLinecap(value: StrokeLinecap): Self = StObject.set(x, "strokeLinecap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeLinecapUndefined: Self = StObject.set(x, "strokeLinecap", js.undefined)
    
    @scala.inline
    def setStrokeLinejoin(value: StrokeLinejoin): Self = StObject.set(x, "strokeLinejoin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeLinejoinUndefined: Self = StObject.set(x, "strokeLinejoin", js.undefined)
    
    @scala.inline
    def setStrokeMiterlimit(value: StrokeMiterlimit): Self = StObject.set(x, "strokeMiterlimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeMiterlimitUndefined: Self = StObject.set(x, "strokeMiterlimit", js.undefined)
    
    @scala.inline
    def setStrokeOpacity(value: StrokeOpacity): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    
    @scala.inline
    def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: StrokeWidth[TLength]): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
    
    @scala.inline
    def setTextAnchor(value: TextAnchor): Self = StObject.set(x, "textAnchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextAnchorUndefined: Self = StObject.set(x, "textAnchor", js.undefined)
    
    @scala.inline
    def setVectorEffect(value: VectorEffect): Self = StObject.set(x, "vectorEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVectorEffectUndefined: Self = StObject.set(x, "vectorEffect", js.undefined)
  }
}
