package com.olvind.mui.csstype.mod.AtRule

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FontFace[TLength, TTime] extends StObject {
  
  var MozFontFeatureSettings: js.UndefOr[FontFeatureSettings] = js.native
  
  var ascentOverride: js.UndefOr[AscentOverride] = js.native
  
  var descentOverride: js.UndefOr[DescentOverride] = js.native
  
  var fontDisplay: js.UndefOr[FontDisplay] = js.native
  
  var fontFamily: js.UndefOr[String] = js.native
  
  var fontFeatureSettings: js.UndefOr[FontFeatureSettings] = js.native
  
  var fontStretch: js.UndefOr[FontStretch] = js.native
  
  var fontStyle: js.UndefOr[FontStyle] = js.native
  
  var fontVariant: js.UndefOr[FontVariant] = js.native
  
  var fontVariationSettings: js.UndefOr[FontVariationSettings] = js.native
  
  var fontWeight: js.UndefOr[FontWeight] = js.native
  
  var lineGapOverride: js.UndefOr[LineGapOverride] = js.native
  
  var sizeAdjust: js.UndefOr[String] = js.native
  
  var src: js.UndefOr[String] = js.native
  
  var unicodeRange: js.UndefOr[String] = js.native
}
object FontFace {
  
  @scala.inline
  def apply[TLength, TTime](): FontFace[TLength, TTime] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFace[TLength, TTime]]
  }
  
  @scala.inline
  implicit class FontFaceMutableBuilder[Self <: FontFace[_, _], TLength, TTime] (val x: Self with (FontFace[TLength, TTime])) extends AnyVal {
    
    @scala.inline
    def setAscentOverride(value: AscentOverride): Self = StObject.set(x, "ascentOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAscentOverrideUndefined: Self = StObject.set(x, "ascentOverride", js.undefined)
    
    @scala.inline
    def setDescentOverride(value: DescentOverride): Self = StObject.set(x, "descentOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescentOverrideUndefined: Self = StObject.set(x, "descentOverride", js.undefined)
    
    @scala.inline
    def setFontDisplay(value: FontDisplay): Self = StObject.set(x, "fontDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontDisplayUndefined: Self = StObject.set(x, "fontDisplay", js.undefined)
    
    @scala.inline
    def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
    
    @scala.inline
    def setFontFeatureSettings(value: FontFeatureSettings): Self = StObject.set(x, "fontFeatureSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontFeatureSettingsUndefined: Self = StObject.set(x, "fontFeatureSettings", js.undefined)
    
    @scala.inline
    def setFontStretch(value: FontStretch): Self = StObject.set(x, "fontStretch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStretchUndefined: Self = StObject.set(x, "fontStretch", js.undefined)
    
    @scala.inline
    def setFontStyle(value: FontStyle): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
    
    @scala.inline
    def setFontVariant(value: FontVariant): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
    
    @scala.inline
    def setFontVariationSettings(value: FontVariationSettings): Self = StObject.set(x, "fontVariationSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontVariationSettingsUndefined: Self = StObject.set(x, "fontVariationSettings", js.undefined)
    
    @scala.inline
    def setFontWeight(value: FontWeight): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    
    @scala.inline
    def setLineGapOverride(value: LineGapOverride): Self = StObject.set(x, "lineGapOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineGapOverrideUndefined: Self = StObject.set(x, "lineGapOverride", js.undefined)
    
    @scala.inline
    def setMozFontFeatureSettings(value: FontFeatureSettings): Self = StObject.set(x, "MozFontFeatureSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMozFontFeatureSettingsUndefined: Self = StObject.set(x, "MozFontFeatureSettings", js.undefined)
    
    @scala.inline
    def setSizeAdjust(value: String): Self = StObject.set(x, "sizeAdjust", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeAdjustUndefined: Self = StObject.set(x, "sizeAdjust", js.undefined)
    
    @scala.inline
    def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    @scala.inline
    def setUnicodeRange(value: String): Self = StObject.set(x, "unicodeRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnicodeRangeUndefined: Self = StObject.set(x, "unicodeRange", js.undefined)
  }
}
