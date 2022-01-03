package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.CSSInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<OverridesStyleRules<CardMediaClassKey>> */
trait PartialOverridesStyleRulesCardMediaClass extends StObject {
  
  var img: js.UndefOr[CSSInterpolation] = js.undefined
  
  var media: js.UndefOr[CSSInterpolation] = js.undefined
  
  var root: js.UndefOr[CSSInterpolation] = js.undefined
}
object PartialOverridesStyleRulesCardMediaClass {
  
  inline def apply(): PartialOverridesStyleRulesCardMediaClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOverridesStyleRulesCardMediaClass]
  }
  
  extension [Self <: PartialOverridesStyleRulesCardMediaClass](x: Self) {
    
    inline def setImg(value: CSSInterpolation): Self = StObject.set(x, "img", value.asInstanceOf[js.Any])
    
    inline def setImgNull: Self = StObject.set(x, "img", null)
    
    inline def setImgUndefined: Self = StObject.set(x, "img", js.undefined)
    
    inline def setMedia(value: CSSInterpolation): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaNull: Self = StObject.set(x, "media", null)
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setRoot(value: CSSInterpolation): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootNull: Self = StObject.set(x, "root", null)
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
