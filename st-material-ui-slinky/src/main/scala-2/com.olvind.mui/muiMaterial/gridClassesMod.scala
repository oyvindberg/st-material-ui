package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridClassesMod {
  
  @JSImport("@mui/material/Grid/gridClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Grid/gridClasses", JSImport.Default)
  @js.native
  val default: GridClasses = js.native
  
  @scala.inline
  def getGridUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getGridUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.container
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.item
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.zeroMinWidth
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.`direction-xs-column`
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.`direction-xs-column-reverse`
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.`direction-xs-row-reverse`
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.`wrap-xs-nowrap`
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.`wrap-xs-wrap-reverse`
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.`spacing-xs-1`
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.`spacing-xs-2`
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.`spacing-xs-3`
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.`spacing-xs-4`
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.`spacing-xs-5`
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.`spacing-xs-6`
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.`spacing-xs-7`
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.`spacing-xs-8`
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.`spacing-xs-9`
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.`spacing-xs-10`
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.`grid-xs-auto`
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.`grid-xs-true`
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.`grid-xs-1`
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.`grid-xs-2`
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.`grid-xs-3`
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.`grid-xs-4`
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.`grid-xs-5`
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.`grid-xs-6`
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.`grid-xs-7`
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.`grid-xs-8`
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.`grid-xs-9`
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.`grid-xs-10`
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.`grid-xs-11`
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.`grid-xs-12`
  */
  trait GridClassKey extends StObject
  
  @js.native
  trait GridClasses extends StObject {
    
    /** Styles applied to the root element if `container={true}`. */
    var container: String = js.native
    
    /** Styles applied to the root element if `direction="column"`. */
    var `direction-xs-column`: String = js.native
    
    /** Styles applied to the root element if `direction="column-reverse"`. */
    var `direction-xs-column-reverse`: String = js.native
    
    /** Styles applied to the root element if `direction="row-reverse"`. */
    var `direction-xs-row-reverse`: String = js.native
    
    var `grid-xs-1`: String = js.native
    
    var `grid-xs-10`: String = js.native
    
    var `grid-xs-11`: String = js.native
    
    var `grid-xs-12`: String = js.native
    
    var `grid-xs-2`: String = js.native
    
    var `grid-xs-3`: String = js.native
    
    var `grid-xs-4`: String = js.native
    
    var `grid-xs-5`: String = js.native
    
    var `grid-xs-6`: String = js.native
    
    var `grid-xs-7`: String = js.native
    
    var `grid-xs-8`: String = js.native
    
    var `grid-xs-9`: String = js.native
    
    var `grid-xs-auto`: String = js.native
    
    var `grid-xs-true`: String = js.native
    
    /** Styles applied to the root element if `item={true}`. */
    var item: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
    
    var `spacing-xs-1`: String = js.native
    
    var `spacing-xs-10`: String = js.native
    
    var `spacing-xs-2`: String = js.native
    
    var `spacing-xs-3`: String = js.native
    
    var `spacing-xs-4`: String = js.native
    
    var `spacing-xs-5`: String = js.native
    
    var `spacing-xs-6`: String = js.native
    
    var `spacing-xs-7`: String = js.native
    
    var `spacing-xs-8`: String = js.native
    
    var `spacing-xs-9`: String = js.native
    
    /** Styles applied to the root element if `wrap="nowrap"`. */
    var `wrap-xs-nowrap`: String = js.native
    
    /** Styles applied to the root element if `wrap="reverse"`. */
    var `wrap-xs-wrap-reverse`: String = js.native
    
    /** Styles applied to the root element if `zeroMinWidth={true}`. */
    var zeroMinWidth: String = js.native
  }
  object GridClasses {
    
    @scala.inline
    def apply(
      container: String,
      `direction-xs-column`: String,
      `direction-xs-column-reverse`: String,
      `direction-xs-row-reverse`: String,
      `grid-xs-1`: String,
      `grid-xs-10`: String,
      `grid-xs-11`: String,
      `grid-xs-12`: String,
      `grid-xs-2`: String,
      `grid-xs-3`: String,
      `grid-xs-4`: String,
      `grid-xs-5`: String,
      `grid-xs-6`: String,
      `grid-xs-7`: String,
      `grid-xs-8`: String,
      `grid-xs-9`: String,
      `grid-xs-auto`: String,
      `grid-xs-true`: String,
      item: String,
      root: String,
      `spacing-xs-1`: String,
      `spacing-xs-10`: String,
      `spacing-xs-2`: String,
      `spacing-xs-3`: String,
      `spacing-xs-4`: String,
      `spacing-xs-5`: String,
      `spacing-xs-6`: String,
      `spacing-xs-7`: String,
      `spacing-xs-8`: String,
      `spacing-xs-9`: String,
      `wrap-xs-nowrap`: String,
      `wrap-xs-wrap-reverse`: String,
      zeroMinWidth: String
    ): GridClasses = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], zeroMinWidth = zeroMinWidth.asInstanceOf[js.Any])
      __obj.updateDynamic("direction-xs-column")(`direction-xs-column`.asInstanceOf[js.Any])
      __obj.updateDynamic("direction-xs-column-reverse")(`direction-xs-column-reverse`.asInstanceOf[js.Any])
      __obj.updateDynamic("direction-xs-row-reverse")(`direction-xs-row-reverse`.asInstanceOf[js.Any])
      __obj.updateDynamic("grid-xs-1")(`grid-xs-1`.asInstanceOf[js.Any])
      __obj.updateDynamic("grid-xs-10")(`grid-xs-10`.asInstanceOf[js.Any])
      __obj.updateDynamic("grid-xs-11")(`grid-xs-11`.asInstanceOf[js.Any])
      __obj.updateDynamic("grid-xs-12")(`grid-xs-12`.asInstanceOf[js.Any])
      __obj.updateDynamic("grid-xs-2")(`grid-xs-2`.asInstanceOf[js.Any])
      __obj.updateDynamic("grid-xs-3")(`grid-xs-3`.asInstanceOf[js.Any])
      __obj.updateDynamic("grid-xs-4")(`grid-xs-4`.asInstanceOf[js.Any])
      __obj.updateDynamic("grid-xs-5")(`grid-xs-5`.asInstanceOf[js.Any])
      __obj.updateDynamic("grid-xs-6")(`grid-xs-6`.asInstanceOf[js.Any])
      __obj.updateDynamic("grid-xs-7")(`grid-xs-7`.asInstanceOf[js.Any])
      __obj.updateDynamic("grid-xs-8")(`grid-xs-8`.asInstanceOf[js.Any])
      __obj.updateDynamic("grid-xs-9")(`grid-xs-9`.asInstanceOf[js.Any])
      __obj.updateDynamic("grid-xs-auto")(`grid-xs-auto`.asInstanceOf[js.Any])
      __obj.updateDynamic("grid-xs-true")(`grid-xs-true`.asInstanceOf[js.Any])
      __obj.updateDynamic("spacing-xs-1")(`spacing-xs-1`.asInstanceOf[js.Any])
      __obj.updateDynamic("spacing-xs-10")(`spacing-xs-10`.asInstanceOf[js.Any])
      __obj.updateDynamic("spacing-xs-2")(`spacing-xs-2`.asInstanceOf[js.Any])
      __obj.updateDynamic("spacing-xs-3")(`spacing-xs-3`.asInstanceOf[js.Any])
      __obj.updateDynamic("spacing-xs-4")(`spacing-xs-4`.asInstanceOf[js.Any])
      __obj.updateDynamic("spacing-xs-5")(`spacing-xs-5`.asInstanceOf[js.Any])
      __obj.updateDynamic("spacing-xs-6")(`spacing-xs-6`.asInstanceOf[js.Any])
      __obj.updateDynamic("spacing-xs-7")(`spacing-xs-7`.asInstanceOf[js.Any])
      __obj.updateDynamic("spacing-xs-8")(`spacing-xs-8`.asInstanceOf[js.Any])
      __obj.updateDynamic("spacing-xs-9")(`spacing-xs-9`.asInstanceOf[js.Any])
      __obj.updateDynamic("wrap-xs-nowrap")(`wrap-xs-nowrap`.asInstanceOf[js.Any])
      __obj.updateDynamic("wrap-xs-wrap-reverse")(`wrap-xs-wrap-reverse`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GridClasses]
    }
    
    @scala.inline
    implicit class GridClassesMutableBuilder[Self <: GridClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: String): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDirection-xs-column`(value: String): Self = StObject.set(x, "direction-xs-column", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDirection-xs-column-reverse`(value: String): Self = StObject.set(x, "direction-xs-column-reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDirection-xs-row-reverse`(value: String): Self = StObject.set(x, "direction-xs-row-reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGrid-xs-1`(value: String): Self = StObject.set(x, "grid-xs-1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGrid-xs-10`(value: String): Self = StObject.set(x, "grid-xs-10", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGrid-xs-11`(value: String): Self = StObject.set(x, "grid-xs-11", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGrid-xs-12`(value: String): Self = StObject.set(x, "grid-xs-12", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGrid-xs-2`(value: String): Self = StObject.set(x, "grid-xs-2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGrid-xs-3`(value: String): Self = StObject.set(x, "grid-xs-3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGrid-xs-4`(value: String): Self = StObject.set(x, "grid-xs-4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGrid-xs-5`(value: String): Self = StObject.set(x, "grid-xs-5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGrid-xs-6`(value: String): Self = StObject.set(x, "grid-xs-6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGrid-xs-7`(value: String): Self = StObject.set(x, "grid-xs-7", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGrid-xs-8`(value: String): Self = StObject.set(x, "grid-xs-8", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGrid-xs-9`(value: String): Self = StObject.set(x, "grid-xs-9", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGrid-xs-auto`(value: String): Self = StObject.set(x, "grid-xs-auto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setGrid-xs-true`(value: String): Self = StObject.set(x, "grid-xs-true", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSpacing-xs-1`(value: String): Self = StObject.set(x, "spacing-xs-1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSpacing-xs-10`(value: String): Self = StObject.set(x, "spacing-xs-10", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSpacing-xs-2`(value: String): Self = StObject.set(x, "spacing-xs-2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSpacing-xs-3`(value: String): Self = StObject.set(x, "spacing-xs-3", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSpacing-xs-4`(value: String): Self = StObject.set(x, "spacing-xs-4", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSpacing-xs-5`(value: String): Self = StObject.set(x, "spacing-xs-5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSpacing-xs-6`(value: String): Self = StObject.set(x, "spacing-xs-6", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSpacing-xs-7`(value: String): Self = StObject.set(x, "spacing-xs-7", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSpacing-xs-8`(value: String): Self = StObject.set(x, "spacing-xs-8", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setSpacing-xs-9`(value: String): Self = StObject.set(x, "spacing-xs-9", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWrap-xs-nowrap`(value: String): Self = StObject.set(x, "wrap-xs-nowrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setWrap-xs-wrap-reverse`(value: String): Self = StObject.set(x, "wrap-xs-wrap-reverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZeroMinWidth(value: String): Self = StObject.set(x, "zeroMinWidth", value.asInstanceOf[js.Any])
    }
  }
}
