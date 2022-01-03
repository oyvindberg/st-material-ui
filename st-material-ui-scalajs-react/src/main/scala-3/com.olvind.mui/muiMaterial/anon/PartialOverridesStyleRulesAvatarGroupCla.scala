package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.CSSInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<OverridesStyleRules<AvatarGroupClassKey>> */
trait PartialOverridesStyleRulesAvatarGroupCla extends StObject {
  
  var avatar: js.UndefOr[CSSInterpolation] = js.undefined
  
  var root: js.UndefOr[CSSInterpolation] = js.undefined
}
object PartialOverridesStyleRulesAvatarGroupCla {
  
  inline def apply(): PartialOverridesStyleRulesAvatarGroupCla = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOverridesStyleRulesAvatarGroupCla]
  }
  
  extension [Self <: PartialOverridesStyleRulesAvatarGroupCla](x: Self) {
    
    inline def setAvatar(value: CSSInterpolation): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
    
    inline def setAvatarNull: Self = StObject.set(x, "avatar", null)
    
    inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
    
    inline def setRoot(value: CSSInterpolation): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootNull: Self = StObject.set(x, "root", null)
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
