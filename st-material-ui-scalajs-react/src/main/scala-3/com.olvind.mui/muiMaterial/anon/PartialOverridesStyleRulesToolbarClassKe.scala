package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.CSSInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<OverridesStyleRules<ToolbarClassKey>> */
trait PartialOverridesStyleRulesToolbarClassKe extends StObject {
  
  var dense: js.UndefOr[CSSInterpolation] = js.undefined
  
  var gutters: js.UndefOr[CSSInterpolation] = js.undefined
  
  var regular: js.UndefOr[CSSInterpolation] = js.undefined
  
  var root: js.UndefOr[CSSInterpolation] = js.undefined
}
object PartialOverridesStyleRulesToolbarClassKe {
  
  inline def apply(): PartialOverridesStyleRulesToolbarClassKe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOverridesStyleRulesToolbarClassKe]
  }
  
  extension [Self <: PartialOverridesStyleRulesToolbarClassKe](x: Self) {
    
    inline def setDense(value: CSSInterpolation): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
    
    inline def setDenseNull: Self = StObject.set(x, "dense", null)
    
    inline def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
    
    inline def setGutters(value: CSSInterpolation): Self = StObject.set(x, "gutters", value.asInstanceOf[js.Any])
    
    inline def setGuttersNull: Self = StObject.set(x, "gutters", null)
    
    inline def setGuttersUndefined: Self = StObject.set(x, "gutters", js.undefined)
    
    inline def setRegular(value: CSSInterpolation): Self = StObject.set(x, "regular", value.asInstanceOf[js.Any])
    
    inline def setRegularNull: Self = StObject.set(x, "regular", null)
    
    inline def setRegularUndefined: Self = StObject.set(x, "regular", js.undefined)
    
    inline def setRoot(value: CSSInterpolation): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootNull: Self = StObject.set(x, "root", null)
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
