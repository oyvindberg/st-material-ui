package com.olvind.mui.muiBase.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/base.@mui/base/ModalUnstyled/modalUnstyledClasses.ModalUnstyledClasses> */
@js.native
trait PartialModalUnstyledClasses extends StObject {
  
  var hidden: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
}
object PartialModalUnstyledClasses {
  
  @scala.inline
  def apply(): PartialModalUnstyledClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialModalUnstyledClasses]
  }
  
  @scala.inline
  implicit class PartialModalUnstyledClassesMutableBuilder[Self <: PartialModalUnstyledClasses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHidden(value: String): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
