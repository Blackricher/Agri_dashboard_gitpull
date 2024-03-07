jQuery(document).ready(function(){   
	jQuery('#userForm').validate(
	{
	errorElement: "span",
	rules:{
		name: {
			required: true
		},
		mobile: {
			required: true,
			number: true,
            minlength: 10,
            maxlength: 10
		},
		userTypeId: {
			required: true,
			min: 1
		},
        loginTypeId: {
        	required: true   
        },
        userId: {
        	required: true   
        },
        roleId: {
        	required: true,
        	min: 1
        }
	},
	messages: {
		userTypeId: {
      		min: "This field is required."
		},
      	roleId: {
      		min: "This field is required."
		}
	},    
	highlight: function (element) {            
            jQuery(element).closest('.loginbox').removeClass('valid form-control').addClass('error-textbox form-control');           
        },        
        success: function (element) {           
			element                          
		}
	}); 
        
 	jQuery('#storageForm').validate(
	{
	errorElement: "span",
	rules:{
		total_compactors: {
			required: true,
			number: true,
			min: 1
		},
        total_racks: {
			required: true,
			number: true,
			min: 1
		},
        total_bundles: {
			required: true,
			number: true,
			min: 1
		}
	},
	highlight: function (element) {            
        	jQuery(element).closest('.loginbox').removeClass('valid form-control').addClass('error-textbox form-control');           
        },
        success: function (element) { 
			element 
		}
	}); 
	
	
	jQuery('#doctypeForm').validate(
	{
	errorElement: "span",
	rules:{
		code: {
			required: true,
			number: true
		},
        name: {
			required: true
		},
		type: {
			required: false
		}
	},
	highlight: function (element) {            
        	jQuery(element).closest('.loginbox').removeClass('valid form-control').addClass('error-textbox form-control');           
        },
        success: function (element) { 
			element 
		}
	});
	
	
	jQuery('#documentForm').validate(
	{
	errorElement: "span",
	rules:{
		archives: {
			required: true
		},
		document_type: {
			required: true
		},
		start_page: {
			required: true,
			number: true,
            min: 1
		},
		end_page: {
			required: true,
			number: true,
            min: 1
		},
        total_pages: {
        	required: true,
        	min: 1
        },
        village_code: {
        	required: true   
        },
        /*khasra_number: {
        	required: true,
        },
        fasli_year: {
        	required: true,
        },*/
        owner_name: {
        	required: true,
        },
        compactor_no: {
			required: true,
			min: 0
		},
		rack_no: {
			required: true,
			min: 0
		},
		bundle_no: {
			required: true,
			min: 0
		}
		/*upload: {
          	required: true
        }*/
	},
	messages: {
		compactor_no: {
      		min: "This field is required."
		},
      	rack_no: {
      		min: "This field is required."
		},
		bundle_no: {
      		min: "This field is required."
		}
	},
	highlight: function (element) {        
            jQuery(element).closest('.loginbox').removeClass('valid form-control').addClass('error-textbox form-control');           
        },        
        success: function (element) {           
			element                          
		}
	}); 
	
	
	jQuery('#menuForm').validate(
	{
	errorElement: "span",
	rules:{
		name: {
			required: true,
		},
        name_eng: {
			required: true,
		}
	},
	highlight: function (element) {            
        	jQuery(element).closest('.loginbox').removeClass('valid form-control').addClass('error-textbox form-control');           
        },
        success: function (element) { 
			element 
		}
	}); 
	
	jQuery('#accessForm').validate(
	{
	errorElement: "span",
	rules:{
		roleId: {
			required: true,
			number: true,
			min: 1
		},
	},
	messages: {
		roleId: {
      		min: "This field is required."
		}
	},    
	highlight: function (element) {            
        	jQuery(element).closest('.loginbox').removeClass('valid form-control').addClass('error-textbox form-control');           
        },
        success: function (element) { 
			element 
		}
	});
	
	
	jQuery('#passupdateForm').validate(
	{
	errorElement: "span",
	rules:{
		old_password: {
			required: true
		},
		new_password: {
			required: true,
			minlength : 6
		},
		confirm_password: {
			required: true,
			minlength : 6
		}
	},
	/*messages: {
		confirm_password: {
      		equalTo: "The new password and confirm password must be same."
		}
	},    */
	highlight: function (element) {            
        	jQuery(element).closest('.loginbox').removeClass('valid form-control').addClass('error-textbox form-control');
        },
        success: function (element) { 
			element 
		}
	});
	
	jQuery('#settingForm').validate(
	{
	errorElement: "span",
	rules:{
		app_name: {
			required: true
		},
		app_subtitle: {
			required: true
		},
		app_about: {
			required: true
		},
        file_upload_type: {
        	required: true
        },
        file_upload_url: {
        	required: true   
        },
        app_developed_by: {
        	required: true
        }
	},
	highlight: function (element) {        
            jQuery(element).closest('.loginbox').removeClass('valid form-control').addClass('error-textbox form-control');           
        },        
        success: function (element) {           
			element                          
		}
	}); 
	  
});