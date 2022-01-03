package com.olvind.mui.muiMaterial.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@mui/material.@mui/material/Table/tableClasses.TableClasses> */
@js.native
trait PartialTableClasses extends StObject {
  
  var root: js.UndefOr[String] = js.native
  
  var stickyHeader: js.UndefOr[String] = js.native
}
object PartialTableClasses {
  
  @scala.inline
  def apply(): PartialTableClasses = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTableClasses]
  }
  
  @scala.inline
  implicit class PartialTableClassesMutableBuilder[Self <: PartialTableClasses] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    
    @scala.inline
    def setStickyHeader(value: String): Self = StObject.set(x, "stickyHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickyHeaderUndefined: Self = StObject.set(x, "stickyHeader", js.undefined)
  }
}
