package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listClassesMod {
  
  @JSImport("@mui/material/List/listClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/List/listClasses", JSImport.Default)
  @js.native
  val default: ListClasses = js.native
  
  @scala.inline
  def getListUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getListUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.padding
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.dense
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.subheader
  */
  trait ListClassKey extends StObject
  
  @js.native
  trait ListClasses extends StObject {
    
    /** Styles applied to the root element if dense. */
    var dense: String = js.native
    
    /** Styles applied to the root element unless `disablePadding={true}`. */
    var padding: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
    
    /** Styles applied to the root element if a `subheader` is provided. */
    var subheader: String = js.native
  }
  object ListClasses {
    
    @scala.inline
    def apply(dense: String, padding: String, root: String, subheader: String): ListClasses = {
      val __obj = js.Dynamic.literal(dense = dense.asInstanceOf[js.Any], padding = padding.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], subheader = subheader.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListClasses]
    }
    
    @scala.inline
    implicit class ListClassesMutableBuilder[Self <: ListClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDense(value: String): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPadding(value: String): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubheader(value: String): Self = StObject.set(x, "subheader", value.asInstanceOf[js.Any])
    }
  }
}
