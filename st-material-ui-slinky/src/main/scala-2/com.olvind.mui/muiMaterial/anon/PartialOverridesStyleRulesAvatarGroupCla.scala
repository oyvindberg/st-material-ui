package com.olvind.mui.muiMaterial.anon

import com.olvind.mui.muiStyledEngine.mod.CSSInterpolation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<OverridesStyleRules<AvatarGroupClassKey>> */
@js.native
trait PartialOverridesStyleRulesAvatarGroupCla extends StObject {
  
  var avatar: js.UndefOr[CSSInterpolation] = js.native
  
  var root: js.UndefOr[CSSInterpolation] = js.native
}
object PartialOverridesStyleRulesAvatarGroupCla {
  
  @scala.inline
  def apply(): PartialOverridesStyleRulesAvatarGroupCla = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialOverridesStyleRulesAvatarGroupCla]
  }
  
  @scala.inline
  implicit class PartialOverridesStyleRulesAvatarGroupClaMutableBuilder[Self <: PartialOverridesStyleRulesAvatarGroupCla] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvatar(value: CSSInterpolation): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvatarNull: Self = StObject.set(x, "avatar", null)
    
    @scala.inline
    def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
    
    @scala.inline
    def setRoot(value: CSSInterpolation): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootNull: Self = StObject.set(x, "root", null)
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
