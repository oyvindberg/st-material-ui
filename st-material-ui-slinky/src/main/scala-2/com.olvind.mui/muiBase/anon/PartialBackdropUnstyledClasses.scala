package com.olvind.mui.muiBase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/base.@mui/base/BackdropUnstyled/backdropUnstyledClasses.BackdropUnstyledClasses> */
@js.native
trait PartialBackdropUnstyledClasses extends StObject {
  
  var invisible: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
}
object PartialBackdropUnstyledClasses {
  
  @scala.inline
  def apply(): PartialBackdropUnstyledClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBackdropUnstyledClasses]
  }
  
  @scala.inline
  implicit class PartialBackdropUnstyledClassesMutableBuilder[Self <: PartialBackdropUnstyledClasses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInvisible(value: String): Self = StObject.set(x, "invisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvisibleUndefined: Self = StObject.set(x, "invisible", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
